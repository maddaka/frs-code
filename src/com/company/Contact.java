package com.company;

public class Contact {
    public String name;
    public String email;
    public String phone;

    Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }



    public String getContactDetails(){
        return "Name: "+this.name+", Email: "+this.email+", Phone: "+this.phone;
    }
}
