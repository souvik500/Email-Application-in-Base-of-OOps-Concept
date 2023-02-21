package com.driver;

import java.util.Date;

public class Address
{
    public Date date;
    public String sender, message;

    public Address(Date date, String sender, String message) {
        this.date = date;
        this.sender = sender;
        this.message = message;
    }
}
