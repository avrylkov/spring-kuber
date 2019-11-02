package com.example.model;

import java.util.Date;

public class Contract {

    private Long id;
    private String number;
    private Long organization;
    private Date createDate;
    private String currentUser;

    public Contract() {

    }

    public Contract(Long id, String number, Long organization, Date createDate) {
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

    public Long getOrganization() {
        return organization;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }
}
