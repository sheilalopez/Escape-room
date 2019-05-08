package edu.upc.dsa.models;

public class Coin extends Object {
    private String id;
    private String type;
    private Double valor;

    public Coin(){

    }

    public Coin(String id, String type, Double valor) {
        this.id = id;
        this.type = type;
        this.valor = valor;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
