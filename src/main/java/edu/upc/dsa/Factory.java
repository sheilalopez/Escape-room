package edu.upc.dsa;

public class Factory {
    static Session getSession() throws Exception {
        return new SessionImpl();
    }
}
