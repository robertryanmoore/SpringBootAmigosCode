package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Autowired
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                "Mariam",
                "mariam.jamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student alex = new Student(
                "Alex",
                "alexl@gmail.com",
                LocalDate.of(2004, Month.JANUARY, 5)
            );
            
            repository.saveAll(Arrays.asList(mariam, alex));
        };
    }
}
