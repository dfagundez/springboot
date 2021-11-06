package com.dfagundez.springboot.springboot.bean;

public class MyBeanTwoImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("Probando implementacion propia del bean dos...");
    }
}
