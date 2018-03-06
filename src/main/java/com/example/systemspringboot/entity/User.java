package com.example.systemspringboot.entity;

/**
 * Created by 马欢欢 on 2018/3/5.
 */

public class User {
   private int id;
   private String name;
   private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
