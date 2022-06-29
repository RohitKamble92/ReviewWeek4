package com.bridgelabz.streamapi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    List<Contact> listContact = new ArrayList<Contact>();

    public static void main(String[] args) {
        Map<String, List<Contact>> cityMap = new LinkedHashMap<>();
        AddressBook addressBook = new AddressBook();
        List<Contact> listContact = new ArrayList<Contact>();

        Contact contact = new Contact("Rohit", "Mumbai", "8600285748");
        Contact contact1 = new Contact("Bhushan", "Pune", "9346030317");
        Contact contact2 = new Contact("Rajesh", "Sangli", "8600285746");
        Contact contact3 = new Contact("Sushant", "Delhi", "9876543201");

        listContact.add(contact);
        listContact.add(contact1);
        listContact.add(contact2);
        listContact.add(contact3);

        List<Contact> collect = listContact.stream().filter(p -> p.getFirstName().equalsIgnoreCase(firstName))
                .collect(Collectors.toList());
        for (Contact contact4 : collect) {
            System.out.println("Search result: " + contact);
        }

        System.out.println(addressBook.listContact);

    }

}



