package com.InsuranceOneOne.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    @Setter
    @Getter
    private String username;
    @Column(nullable = false)
    @Setter
    @Getter
    private String email;
    @Column(nullable = false)
    @Setter
    @Getter
    private String password;


    public Client(){ }

    public Client(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
}
