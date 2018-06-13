package com.ideacrest.springdemo.controller;

public class Rough {
    public static void main(String[] args) {
        String name = "656, 8787";
        name = name.split(",")[0];
        int i = Integer.parseInt(name);
        System.out.println(i);
        System.out.println(name.split(",")[0]);
    }
}
