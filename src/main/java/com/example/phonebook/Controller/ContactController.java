package com.example.phonebook.Controller;

import com.example.phonebook.Model.Contact;
import com.example.phonebook.Model.Dto.ContactRequest;
import com.example.phonebook.Service.ContactService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/contact")
@AllArgsConstructor
public class ContactController {
    private final ContactService contactService;
    @PostMapping()
    public ResponseEntity<Contact> create(@RequestBody ContactRequest request){
        return new ResponseEntity<>(contactService.createContact(request), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Contact>> getALlContacts(){
        return new ResponseEntity<>(contactService.getAllContacts(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Contact> getContact(@PathVariable("id") Long id){
        return new ResponseEntity<>(contactService.getContact(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public void delete(@PathVariable("id") Long id){
         contactService.deleteContact(id);
    }
}
