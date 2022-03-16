package com.company;

public class Box<T, T1, T2> {
    private T quantities;
    private T1 money;
    private T2 where;

    public Box(T quantities, T1 money, T2 where) {
        this.quantities = quantities;
        this.money = money;
        this.where = where;
    }
    @Override
    public String toString(){
        return "quantities:" + quantities +
                " money:" + money +
                " where:" + where;
    }
    public static Box sum(){
        Box<String,Integer,String>box = new Box<>("good ",236," London");
        return box;
    }
}
