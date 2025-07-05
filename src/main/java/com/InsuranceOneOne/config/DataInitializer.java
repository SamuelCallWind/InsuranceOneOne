package com.InsuranceOneOne.config;

import com.InsuranceOneOne.entity.Claim;
import com.InsuranceOneOne.entity.Client;
import com.InsuranceOneOne.entity.InsurancePolicy;
import com.InsuranceOneOne.repository.ClaimRepository;
import com.InsuranceOneOne.repository.ClientRepository;
import com.InsuranceOneOne.repository.InsurancePolicyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ClientRepository clientRepo,
                                   InsurancePolicyRepository insurancePolicyRepo,
                                   ClaimRepository claimRepo) {
        return args -> {
             Client client = Client.builder()
                     .username("john_doe")
                     .email("johndoeexampleofemail@example.com")
                     .password("Thesecretpassword")
                     .build();
             clientRepo.save(client);

             InsurancePolicy policy = InsurancePolicy.builder()
                     .client(client)
                     .policyNumber("POL1234567")
                     .coverageAmount(new BigDecimal(50000))
                     .type("car")
                     .build();
             insurancePolicyRepo.save(policy);

             Claim claim = Claim.builder()
                     .claimAmount(new BigDecimal(800))
                     .description("The description of the claim")
                     .claimDate(LocalDate.now())
                     .insurancePolicy(policy)
                     .build();
             claimRepo.save(claim);
        };
    }


}
