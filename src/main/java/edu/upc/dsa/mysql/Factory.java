package edu.upc.dsa.mysql;

public class Factory {
    static Session getSession() throws Exception {
        return new SessionImpl();
    }
}
