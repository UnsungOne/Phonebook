package com.phonebook.phonebook.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.phonebook.phonebook.model.PhoneEntry;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneEntryService {


    List<PhoneEntry> phoneEntries = new ArrayList<>();
    private static final String CARDS_FILENAME = "cards.json";
    private static Gson gson = new Gson();

    public List<PhoneEntry> displayAllEntries(){

        try {
            String json = org.apache.commons.io.FileUtils.readFileToString(new File(CARDS_FILENAME), "UTF-8");
            Type type = new TypeToken<ArrayList<PhoneEntry>>() {
            }.getType();
            List<PhoneEntry> temp = gson.fromJson(json, type);
            return temp != null ? temp : new ArrayList<>();

        } catch (IOException e) {
            System.out.println("Failed to read from file: " + e.getLocalizedMessage());
            return new ArrayList<>();
        }
    }

    public List<PhoneEntry> addPhoneEntry() {

        return phoneEntries;
    }
}