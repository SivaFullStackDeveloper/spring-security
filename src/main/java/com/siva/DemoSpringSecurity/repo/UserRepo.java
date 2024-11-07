package com.siva.DemoSpringSecurity.repo;

import com.siva.DemoSpringSecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepo extends JpaRepository<User,Long> {
}
