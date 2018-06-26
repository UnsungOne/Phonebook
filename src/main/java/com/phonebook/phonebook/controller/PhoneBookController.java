package com.phonebook.phonebook.controller;


import com.phonebook.phonebook.service.PhoneEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class PhoneBookController {

    @Autowired
    PhoneEntryService phoneEntryService;

    @GetMapping("/phonebook")
    public String getMain(Map<String, Object> model) {

        String userName = System.getProperty("user.name");
        phoneEntryService.displayAllEntries();
        phoneEntryService.addPhoneEntry();
        model.put("userName", userName);
        return "phonebook";
    }
}