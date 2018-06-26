package com.phonebook.phonebook.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

@Data
public class PhoneEntryModel {
    @NotNull
    @SerializedName("companyPhone")
    int companyPhone;

    @NotNull
    @Digits(integer = 9, fraction = 0)
    @SerializedName("companyName")
    String companyName;
}