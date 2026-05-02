package com.kishan.loveable_clone.repository;

import com.kishan.loveable_clone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
