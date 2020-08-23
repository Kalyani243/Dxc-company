package com.dxc.integratedbank.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.integratedbank.dao.BankDao;
import com.dxc.integratedbank.entity.User;
@Service
public class BankService 
{
	@Autowired
	BankDao bankDao;
	public User addUser(User user)
	{
		return this.bankDao.save(user);
	}
	
	
}












/*public class BankService 
{
	@Autowired
	private BankDao bankDao;
	public User addUser(User user)
	{
		return this.bankDao.save(user);
	}
	public User fetchUserById(Integer userid)
	{
		return this.bankDao.findByUserId(userid);
		
	}
}*/
	/*public List<User> getAllUsers() {
		return this.bankDao.findAll();
	}
	
	
	
	// Optional is a Container object which may or may not contain non null values
	public Optional <User> getUserById(int id ) {
		return this.bankDao.findById(id);
	}
	
	public User updateUser(User user) {
		return this.bankDao.save(user);
	}
	
	public void deleteUserById(int id) {
		this.bankDao.deleteById(id);
	}
	
	public void deleteAllUsers() {
		this.bankDao.deleteAll();
	} 
	public User addUser(User user) {
	return this.bankDao.save(user);
}

}*/
