package edu.upc.dsa.models;

public class Clue extends Object {
    private String id;
    private String type;
    private String message;

    public Clue(){

    }
    public Clue(String id, String type, String message) {
        this.id = id;
        this.type = type;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
