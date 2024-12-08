package com.qlbv.DoAnNhom_CS._W.SpringBackend.service;

import com.qlbv.DoAnNhom_CS._W.SpringBackend.DAO.RoleRepository;
import com.qlbv.DoAnNhom_CS._W.SpringBackend.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getRoles()
    {
        return roleRepository.findAll();
    }
}
