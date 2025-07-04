package com.InsuranceOneOne.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Table(name = "insurance_policies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private int policyNumber;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private BigDecimal coverageAmount;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
}
