package com.bridgelabz.streamapi;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AddressBook {

    private final Map<String, List<Contact>> map = new LinkedHashMap<>();
    private final Map<String, List<Contact>> cityMap = new LinkedHashMap<>();
    List<Contact> listContact = new ArrayList<Contact>();

}