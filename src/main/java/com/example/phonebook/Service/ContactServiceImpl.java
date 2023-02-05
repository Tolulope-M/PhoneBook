package com.example.phonebook.Service;

import com.example.phonebook.Model.Contact;
import com.example.phonebook.Model.Dto.ContactRequest;
import com.example.phonebook.Repository.ContactRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ContactServiceImpl implements ContactService{


    private final ContactRepository contactRepository;

    @Override
    public Contact createContact(ContactRequest contactRequest) {
    Contact contact = Contact.builder()
        .Address(contactRequest.getAddress())
        .Name(contactRequest.getName())
        .phoneNumber(contactRequest.getPhoneNumber())
        .build();

        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContact(Long id) {
        return contactRepository.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
    }

    @Override
    public void deleteContact(Long id) {
    contactRepository.deleteById(id);
    }
}
