package com.springapp.model;

/**
 * Created by SayedMahmudRaihan on 10/30/2016.
 */
public class Student {
    private int id;
    private String name;
    private String roll;
    private String address;

    public Student(int id, String name, String roll, String address) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.address = address;
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

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
