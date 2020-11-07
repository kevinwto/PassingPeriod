package com.example.passingperiod;

 abstract class Contact{
    private String firstname;
    private String lastname;
    private String Id;
    private String phoneNumber;
    private boolean isfree;

    public Contact(String firstname, String lastname, String Id, String phoneNumber, 
    boolean isfree){
        this.firstname = firstname;
        this.lastname = lastname;
        this.Id = Id;
        this.phoneNumber = phoneNumber;
        this.isfree = isfree;
    }

    public void setname(String fname, String lname){
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

    public void setisfree(boolean free){
        this.isfree = free;
    }

    public boolean getisfree(){
        return this.isfree;
    }
}