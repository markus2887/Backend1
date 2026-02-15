package com.carrental.items;

import com.carrental.SequenceNumberProviderLazy;

public class Car extends Item {

    private int id;

    protected String brand;
    protected String model;
    protected String year;
    protected String color;

    public Car(){
    }

    public Car(double price, String description, String brand, String model, String year, String color) {
        super(price, description);
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.id = SequenceNumberProviderLazy.getInstance().getNextNumber();
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
