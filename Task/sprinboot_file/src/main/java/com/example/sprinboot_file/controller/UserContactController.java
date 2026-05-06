package com.example.sprinboot_file.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.sprinboot_file.entity.UserContact;
import com.example.sprinboot_file.service.UserContactService;
import jakarta.validation.Valid;;


@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserContactController {

    @Autowired
    private UserContactService service;

    @PostMapping
    public ResponseEntity<?> saveContact(@Valid @RequestBody UserContact user){

        return ResponseEntity.ok(service.save(user));
    }

    @GetMapping
    public List<UserContact> getAllUsers(){

        return service.getAllUsers();
    }
}
