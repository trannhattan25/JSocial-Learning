package com.tranhatan.Social.Learning.repository;

import com.tranhatan.Social.Learning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
