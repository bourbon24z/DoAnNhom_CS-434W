package com.qlbv.DoAnNhom_CS._W.SpringBackend.DAO;

import com.qlbv.DoAnNhom_CS._W.SpringBackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmailAndPassword(String email, String password);
}
