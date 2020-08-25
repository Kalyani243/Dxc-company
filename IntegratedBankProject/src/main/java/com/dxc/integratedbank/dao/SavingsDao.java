package com.dxc.integratedbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.integratedbank.entity.SavingsUser;

public interface SavingsDao extends JpaRepository<SavingsUser, Integer>{

	//SavingsUser findByUserEnterAmount(Long enteramount);

	//SavingsUser findBySavingsUserEnterAmount(int enteramount);

	

}

