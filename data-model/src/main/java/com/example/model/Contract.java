package com.example.model;

import java.util.Date;

public class Contract {

    private Long id;
    private String number;
    private Organization organization;
    private Date createDate;

    public Contract() {

    }

    public Contract(Long id, String number, Organization organization, Date createDate) {
        super();
        this.id = id;
        this.number = number;
        this.organization = organization;
        this.createDate = createDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public Organization getOrganization() {
        return organization;
    }

    public Date getCreateDate() {
        return createDate;
    }
}
