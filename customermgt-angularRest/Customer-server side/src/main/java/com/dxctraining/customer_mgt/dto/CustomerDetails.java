package com.dxctraining.customer_mgt.dto;

public class CustomerDetails {

    private int id;

    private String name;

    private double balance;

    public CustomerDetails(){

    }

    public CustomerDetails(int id, String name,double balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
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

    public double getBalance() {
        return balance;
    }

    public void getBalance(double balance) {
        this.balance = balance;
    }

}
