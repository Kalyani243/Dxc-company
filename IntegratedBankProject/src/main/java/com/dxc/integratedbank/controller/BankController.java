package com.dxc.integratedbank.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.dxc.integratedbank.entity.User;
import com.dxc.integratedbank.service.BankService;

@RestController
@RequestMapping("/user")
public class BankController  {
	@Autowired
	BankService bankService;
	// http://localhost:28080/bank/addUser
	@RequestMapping(value = "/addUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User addUser(@RequestBody User user) {
		return this.bankService.addUser(user);
	}
}


	




