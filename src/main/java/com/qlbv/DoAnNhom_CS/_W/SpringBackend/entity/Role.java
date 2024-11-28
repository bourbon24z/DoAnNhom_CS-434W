package com.qlbv.DoAnNhom_CS._W.SpringBackend.entity;

import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.PERSIST, CascadeType.REFRESH})
    private List<User> userList;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }
    public void addUser(User user) {
        if (this.userList == null) {
            this.userList = new ArrayList<User>();
        }
        userList.add(user);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
