package com.example.registrationloginemailverification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class RegistrationLoginEmailVerificationApplication {

  public static void main(String[] args) {
    SpringApplication.run(RegistrationLoginEmailVerificationApplication.class, args);
  }

}
