package com.phonebook.phonebook.service;

import com.phonebook.phonebook.model.PhoneEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PhoneEntryService {
    List<PhoneEntry> phoneEntries = new ArrayList<>();

    public List<PhoneEntry> displayAllEntries() {


        return phoneEntries;
    }

    public List<PhoneEntry> addPhoneEntry() {

        return phoneEntries;
    }
}