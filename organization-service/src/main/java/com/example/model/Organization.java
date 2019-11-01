package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private Long id;
    private String name;
    private String inn;
    protected List<Contract> contracts = new ArrayList<>();

    public Organization() {

    }

    public Organization(Long id, String name, String inn) {
        super();
        this.id = id;
        this.name = name;
        this.inn = inn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInn() {
        return inn;
    }

    public List<Contract> getContracts() {
        return contracts;
    }
}
