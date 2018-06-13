package com.ideacrest.springdemo.controller;

import java.util.List;

public class FormCollector {
    List<String> countries;

    public FormCollector(List<String> countries) {
        this.countries = countries;
    }

    public FormCollector() {
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public List<String> getCountries() {
        return countries;
    }
}
