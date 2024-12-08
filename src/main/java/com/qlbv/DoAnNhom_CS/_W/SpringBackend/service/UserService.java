package com.qlbv.DoAnNhom_CS._W.SpringBackend.service;

import com.qlbv.DoAnNhom_CS._W.SpringBackend.DAO.UserRepository;
import com.qlbv.DoAnNhom_CS._W.SpringBackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public UserService(UserRepository userRepository) {
        this.repository = userRepository;
    }
    public void save(User user) {
        try { repository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public User findByEmailAndPassword(String email, String password) {
        return repository.findByEmailAndPassword(email, password);
    }
}