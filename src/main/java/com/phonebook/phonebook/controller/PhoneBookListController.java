package com.phonebook.phonebook.controller;

import com.phonebook.phonebook.model.PhoneEntryModel;
import com.phonebook.phonebook.service.PhoneEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class PhoneBookListController {

    @Autowired
    PhoneEntryService phoneEntryService;

    @GetMapping("/list")
    public String getPhoneBookList(Map<String, Object> modelData) {
        List<PhoneEntryModel> listOfEntries = new ArrayList<>(phoneEntryService.getAllEntries());
        modelData.put("entries", listOfEntries);
        return "phonebooklist";
    }

}