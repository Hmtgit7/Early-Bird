package com.inn.cafe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inn.cafe.POJO.User;


public class UserDao extends JpaRepository<User,Integer> {
    
}