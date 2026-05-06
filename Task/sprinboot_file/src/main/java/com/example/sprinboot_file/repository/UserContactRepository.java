package com.example.sprinboot_file.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.sprinboot_file.entity.UserContact;

public interface UserContactRepository extends JpaRepository<UserContact, Integer> {
    Optional<UserContact> findByEmail(String email);
}
