package com.example.GreetingApp.Repository;

import com.example.GreetingApp.Model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser,Long> {
    <optional> AuthUser findByEmail(String email);

    boolean existsByEmail(String email);
}
