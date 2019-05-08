package edu.upc.dsa.mysql;

import org.apache.log4j.Logger;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.List;

public class SessionImpl implements Session {

    private Logger log = Logger.getLogger(SessionImpl.class.getName());
    private Connection connection;

    SessionImpl() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/dsaDDBB", "root", "root");
        } catch (Exception e) {
            log.error("Error exception");
            e.printStackTrace();
        }
    }

    public void save(Object entity) throws Exception {

        Field[] fields = entity.getClass().getDeclaredFields();
        StringBuilder sb = new StringBuilder();

        String query ="INSERT INTO " + entity.getClass().getSimpleName() +" (";
        for (Field f: fields) sb.append(f.getName()).append(",");
        query += sb.deleteCharAt(sb.length() - 1).toString();
        query += ") VALUES (";
        sb = new StringBuilder();
        for (Field f: fields) sb.append("?,");
        query += sb.deleteCharAt(sb.length() - 1).toString();
        query += ")";

        PreparedStatement prep = this.connection.prepareStatement(query);
        for (int i = 1; i < fields.length + 1; i++) prep.setString(i, new PropertyDescriptor(fields[i - 1].getName(), entity.getClass()).getReadMethod().invoke(entity).toString());
        prep.execute();
        prep.close();

        log.info("query: " + query);
    }

    //Esta sin acabar
    public Object get(Class theClass, int id) {
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = this.connection.createStatement();
            if (stmt.execute("SELECT * FROM " + theClass.getSimpleName())) {
                rs = stmt.getResultSet();
                //theClass.getConstructor();
            }

            log.info(rs);
            return rs;
        }
        catch (SQLException ex){
            log.error("SQLException: " + ex.getMessage());
            log.error("SQLState: " + ex.getSQLState());
            log.error("VendorError: " + ex.getErrorCode());
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore

                stmt = null;
            }
    }
        return null;
    }

    public void update(Object entity, int id) {
        //String query ="UPDATE" + entity.getClass().getSimpleName() + "SET";
        //System.out.println("query "+query);
    }

    public void delete(Object object, int id) {
        String query ="DELETE FROM " + object.getClass().getSimpleName() + "WHERE id = " + id;
        System.out.println("query "+query);
    }

    public List<Object> findAll(Class theClass) {
        return null;
    }

    public void close() throws Exception {
        this.connection.close();
    }
}
