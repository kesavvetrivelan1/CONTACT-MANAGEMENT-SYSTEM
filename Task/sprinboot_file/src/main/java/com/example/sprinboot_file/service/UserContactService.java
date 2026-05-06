package com.example.sprinboot_file.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.sprinboot_file.entity.UserContact;
import com.example.sprinboot_file.repository.UserContactRepository;


@Service
public class UserContactService {

    @Autowired
    private UserContactRepository repository;

    public UserContact save(UserContact user){

        return repository.save(user);
    }

    public List<UserContact> getAllUsers(){

        return repository.findAll();
    }

}
