package com.company.entity.classes;

import com.company.Exceptions.InvalidEmailAddressException;
import com.company.Exceptions.InvalidPhoneNumberException;

import java.io.Serializable;
import java.util.regex.Pattern;

public abstract class GeneralAccount implements Serializable {
    final private String userName;
    private String name;
    private String lastName;
    private String email;
    private long phoneNumber;
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if (!Pattern.matches(".+@.+[.].+", email))
            throw new InvalidEmailAddressException("email address format not valid");
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        if (!Pattern.matches("9\\d{8}", String.valueOf(phoneNumber))) {
            throw new InvalidPhoneNumberException("Phone number format not valid");}
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public GeneralAccount(String userName, String name, String lastName, String email, long phoneNumber, String password) {
        this.userName = userName;
        setName(name);
        setLastName(lastName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setPassword(password);
    }
}
