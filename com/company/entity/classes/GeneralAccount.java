package com.company.entity.classes;

public abstract class GeneralAccount {
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
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
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
