package com.vincentbrusco.contactmanager.contactmanager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Instructs hibernate to create table
public class Human {

    @Id //primary key
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;
    private String midName;

    public Human(){super();}

    public Human(String firstName, String lastName, String midName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = midName;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMidName() {
        return midName;
    }
    public void setMidName(String midName) {
        this.midName = midName;
    }
}
