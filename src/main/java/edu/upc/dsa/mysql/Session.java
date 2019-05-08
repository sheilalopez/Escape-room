package edu.upc.dsa.mysql;

import java.util.List;

public interface Session {
    void save(Object entity) throws Exception;
    Object get(Class theClass, int id);
    void update(Object object, int id);
    void delete(Object object, int id);
    List<Object> findAll(Class theClass);
    void close() throws Exception;
}