package com.addressbook;

public class Contact {
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    int zip;
    long phone_no;
    String email;

    public void set(String firstname, String lastname, String address, String city, String state, int zip, long phone_no, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_no = phone_no;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public String getEmail() {
        return email;
    }
}
