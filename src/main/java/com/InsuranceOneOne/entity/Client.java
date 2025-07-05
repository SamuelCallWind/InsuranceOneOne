package com.InsuranceOneOne.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Clients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    @Setter
    @Getter
    private String username;
    @Column(nullable = false, unique = true)
    @Setter
    @Getter
    private String email;
    @Column(nullable = false)
    @Setter
    @Getter
    private String password;



}
