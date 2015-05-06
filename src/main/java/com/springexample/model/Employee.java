package com.springexample.model;

import javax.persistence.*;

/**
 * Created by banga on 5/6/15.
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private int employee_id;

    @Column(name = "fname")
    private String fname;

    private String lname;

    private String phone;

    private String email;


    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





}
