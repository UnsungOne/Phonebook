package com.phonebook.phonebook.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@Controller
public class PhoneBookController {


    @GetMapping("/")
    public String getMain(Map<String, Object> model,
                          @RequestHeader(value = "User-Agent") String userAgent) {

        String userName = System.getProperty("user.name");
        model.put("userName", userName);
        model.put("userAgent", userAgent);
        return "main";
    }
}