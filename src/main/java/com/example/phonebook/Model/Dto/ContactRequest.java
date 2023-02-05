package com.example.phonebook.Model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.NotFound;

@Data
@AllArgsConstructor
public class ContactRequest {
    @NotFound
    private String Name;
    private Long phoneNumber;
    private String Address;
}
