package com.example.phonebook.Service;

import com.example.phonebook.Model.Contact;
import com.example.phonebook.Model.Dto.ContactRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {

    Contact createContact(ContactRequest contact);
    List<Contact> getAllContacts();
    Contact getContact(Long id);
    void deleteContact(Long id);




}
