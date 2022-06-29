package com.bridgelabz.streamapi;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
    }

    public static class addContacts {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> cityNames = new ArrayList<>();
        names.add("Rohit");
        cityNames.add("Mumbai");
        cityNames.add("Bhushan");
        cityNames.add("Pune");
        names.add("Rajesh");
        cityNames.add("Nashik");

        for(int i = 0; i<names.size(); i++){
            if (names.get(i).equalsIgnoreCase(name)) {
                System.out.println("Number: " + numbers.get(i));
            }
        }
    }
}
