package edu.upc.dsa.models;

public class Weapon extends Object {
    private String id;
    private String type;
    private String damage;
    private String range;

    public Weapon(){

    }
    public Weapon(String id, String type, String damage, String range) {
        this.id = id;
        this.type = type;
        this.damage = damage;
        this.range = range;
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

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }
}
