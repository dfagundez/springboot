package com.dfagundez.springboot.springboot.bean;

public class MyBeanImplement implements MyBean {
    @Override
    public void print() {
        System.out.println("Probando implementacion propia del bean...");
    }
}
