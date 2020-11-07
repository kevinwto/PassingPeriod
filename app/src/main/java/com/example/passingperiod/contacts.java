package com.example.passingperiod;

public abstract class Contact{
    private String firstname;
    private String lastname;
    private String Id;
    private String phoneNumber;

    public Contact(String firstname, String lastname, String Id, String phoneNumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.Id = Id;
        this.phoneNumber = phoneNumber;
    }

    public void setname(String fname, lname){
        this.firstname = fname;
        this.lastname =  lname;
    }

    public String getlastname(){
        return this.lastname;
    }

    public String getfirstname(){
        return this.firstname;
    }

    public String getphoneNumber(){
        return this.phoneNumber;
    }
}