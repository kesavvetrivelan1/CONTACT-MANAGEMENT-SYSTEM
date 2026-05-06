package com.example.sprinboot_file.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_contact")

public class UserContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;
    @NotBlank(message = "Name is required") private String name;
    @Email(message = "Invalide email")
    @NotBlank(message = "Email is required") private String email;
    @NotBlank(message = "Phone is required") private String phone;
    private String city;
    private String message;
    @Column(name = "created_at") private LocalDateTime createdAt = LocalDateTime.now();
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getPhone()
    {
        return phone;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }
    public String getMessage()
    {
        return message;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }
    public LocalDateTime getCreatedAt()
    {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt)
    {
        this.createdAt = createdAt;
    }
}
