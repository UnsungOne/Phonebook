package com.phonebook.phonebook;

import com.phonebook.phonebook.model.PhoneEntryModel;
import com.phonebook.phonebook.service.PhoneEntryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PhonebookApplication {

    @Bean
    public PhoneEntryModel phoneEntryModel() {
        return new PhoneEntryModel();
    }


    @Bean
    public PhoneEntryService phoneEntryService() {
        return new PhoneEntryService();
    }

    public static void main(String[] args) {
        SpringApplication.run(PhonebookApplication.class, args);
    }
}
