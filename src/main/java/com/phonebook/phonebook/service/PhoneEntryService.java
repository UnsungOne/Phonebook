package com.phonebook.phonebook.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.phonebook.phonebook.model.PhoneEntryModel;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneEntryService {


    private static final String FILENAME = "phonebook.json";
    private static Gson gson = new Gson();

    public List<PhoneEntryModel> getAllEntries(){

        try {
            String json = org.apache.commons.io.FileUtils.readFileToString(new File(FILENAME), "UTF-8");
            Type type = new TypeToken<ArrayList<PhoneEntryModel>>() {
            }.getType();
            List<PhoneEntryModel> temp = gson.fromJson(json, type);
            return temp != null ? temp : new ArrayList<>();

        } catch (IOException e) {
            System.out.println("Failed to read from file: " + e.getLocalizedMessage());
            return new ArrayList<>();
        }
    }

}