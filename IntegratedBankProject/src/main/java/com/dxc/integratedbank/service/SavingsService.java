package com.dxc.integratedbank.service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.integratedbank.dao.SavingsDao;
import com.dxc.integratedbank.entity.SavingsUser;
@Service
public class SavingsService 
{
	@Autowired
	SavingsDao savingsDao;
	public SavingsUser addSavingsUser(SavingsUser savingsuser)
	{
		return this.savingsDao.save(savingsuser);
	}
	public SavingsUser fetchSavingsUserByEnterAmount(long enteramount)
	{
		return this.savingsDao.findBySavingsUserEnterAmount(enteramount);
		
	}
	
	
}





