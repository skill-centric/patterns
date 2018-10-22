package com.skillcentric;

public class OldEmployee {

    private String firstName;  //required
    private String lastName;   //required
    private int age;           //required
    private int personalId;    //required
    private String phone;      //optional
    private String address;    //optional
    private String mail;       //optional

    public OldEmployee(String firstName, String lastName, int age, int personalId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalId = personalId;
    }

    public OldEmployee(String firstName, String lastName, int age, int personalId,
                       String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalId = personalId;
        this.phone = phone;
    }

    public OldEmployee(String firstName, String lastName, int age, int personalId,
                       String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalId = personalId;
        this.phone = phone;
        this.address = address;
    }

    public OldEmployee(String firstName, String lastName, int age, int personalId,
                       String phone, String address, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalId = personalId;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}