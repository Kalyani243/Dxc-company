package com.dxc.integratedbank.service;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.integratedbank.dao.ReoccuringDao;
import com.dxc.integratedbank.entity.ReoccuringUser;
@Service
public class ReoccuringService {
	@Autowired
	  ReoccuringDao reoccuringDao;
	public ReoccuringUser addReoccuringUser(ReoccuringUser reoccuringuser)
	{
		return this.reoccuringDao.save(reoccuringuser);
	}
	
}


