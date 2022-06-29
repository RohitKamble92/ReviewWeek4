package com.bridgelabz.streamapi;

public class AddContact {
    String firstName;
    String lastName;
    String city;
    String mobileNumber;

    public void Contact(String firstName, String lastName, String city, String mobileNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", mobileNumber="
                + mobileNumber + "]";
    }

}

