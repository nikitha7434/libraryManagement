package com.examplespring.libraryManagement;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="student_table")
public class student {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int  stdid;

    public student() {
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStdid() {
        return stdid;
    }

    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    String name;
    int age;

    int phoneNumber;

    String city;

    public student(String name,int age,int phoneNumber,String city) {

        this.name=name;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public libraycard getLibraycard() {
        return libraycard;
    }

    public void setLibraycard(libraycard libraycard) {
        this.libraycard = libraycard;
    }

    @OneToOne // liftside current class --> student
    @JoinColumn
    libraycard libraycard;

    @CreationTimestamp
    private Date createdOn;
    @UpdateTimestamp
    private Date updatedOn;
}
