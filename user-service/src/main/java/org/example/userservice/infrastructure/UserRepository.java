package org.example.userservice.infrastructure;

import org.example.userservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
    User findByUserId(String userId);
}
