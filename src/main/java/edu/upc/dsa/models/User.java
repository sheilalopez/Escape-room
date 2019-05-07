package edu.upc.dsa.models;

import java.util.LinkedList;

public class User {
    //Atributes
    private String id;
    private String username;
    private String password;
    private LinkedList <Object> objects;
    private int cash;
    private int level;
    private String pos;
    //constructors

    public User (){

    }


    public User(String username, String password, int cash, int level, String pos) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.objects = new LinkedList<Object>();
        this.cash = cash;
        this.level = level;
        this.pos = pos;
    }
    //Methods


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LinkedList<Object> getObjects() {
        return objects;
    }

    public void setObjects(LinkedList<Object> objects) {
        this.objects = objects;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
