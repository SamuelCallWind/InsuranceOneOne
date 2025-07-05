package com.InsuranceOneOne.repository;

import com.InsuranceOneOne.entity.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Long> {
    InsurancePolicy findByPolicyNumber(String PolicyNumber);
}
