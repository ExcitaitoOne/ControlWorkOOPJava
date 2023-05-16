package org.example;

public class Toys extends ArrayToys
{
    private int id;
    private String name;
    private int numberOf;
    private int luck;

    public Toys(int id, String name, int numberOf, int luck) {
        this.id = id;
        this.name = name;
        this.numberOf = numberOf;
        this.luck = luck;
    }

    public Toys() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOf() {
        return numberOf;
    }

    public void setNumberOf(int numberOf) {
        this.numberOf = numberOf;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

}
