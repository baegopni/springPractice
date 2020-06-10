package com.bora.practice.model;

public class User {
    private String phone;
    private String name;
    private String addr;
    private String arr[];

    public User(String phone, String name, String addr, String arr[]){
        this.phone = phone;
        this.name = name;
        this.addr = addr;
        this.arr = arr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
