package com.dxc.integratedbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.integratedbank.entity.User;




public interface BankDao extends JpaRepository<User, Integer> {
 //public User findByUserId(Integer userid);
}
