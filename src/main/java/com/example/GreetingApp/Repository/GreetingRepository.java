package com.example.GreetingApp.Repository;

import com.example.GreetingApp.DTO.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long> {

}
