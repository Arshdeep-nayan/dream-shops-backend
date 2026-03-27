package com.arshdeep.backend.dreamshops.repository;

import com.arshdeep.backend.dreamshops.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
