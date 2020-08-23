package com.dxc.integratedbank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.integratedbank.entity.SavingsUser;

public interface SavingsDao extends JpaRepository<SavingsUser, Long>{

	//SavingsUser findByUserEnterAmount(Long enteramount);

	SavingsUser findBySavingsUserEnterAmount(long enteramount);

	

}

