package com.company;

public class Address {
    public  String street;
    public String city;
    public String state;

    Address(String street,String city,String state){
        this.street=street;
        this.city=city;
        this.state=state;
    }

    public String getAddressDetails(){
        return "Street: "+this.street+", City: "+this.city+", State: "+this.state;
    }


}
