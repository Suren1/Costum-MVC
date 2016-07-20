/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapforg.custommvc.entity;

/**
 *
 * @author suren
 */
public class Course {
    
    private int id;
    private String name, description;
    private Double fees;
    private Boolean status;

    public Course() {
    }

    public Course(int id, String name, String description, Double fees, Boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.fees = fees;
        this.status = status;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    
    
    
}
