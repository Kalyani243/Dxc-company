package com.dxc.integratedbank.service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dxc.integratedbank.dao.FixedDao;
import com.dxc.integratedbank.entity.FixedUser;

@Service
public class FixedService {
	@Autowired
	 private FixedDao fixedDao;
	public FixedUser addFixedUser(FixedUser fixeduser)
	{
		return this.fixedDao.save(fixeduser);
	}
	public Optional<FixedUser> fetchByName(String name)
	{
		return fixedDao.findByName(name);
	}
	
	
	
	
}
