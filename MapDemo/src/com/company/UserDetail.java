package com.company;

public class UserDetail {
    public String address;
    public String password;
    public String mailAddress;
    public String phoneNumber;

    @Override
    public String toString() {
        return "UserDetail{" +
                "address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
