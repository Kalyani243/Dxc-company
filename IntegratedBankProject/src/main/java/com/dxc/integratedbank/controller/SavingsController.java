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
import com.dxc.integratedbank.entity.SavingsUser;
import com.dxc.integratedbank.service.SavingsService;
@RestController
@RequestMapping("/savingsuser")
public class SavingsController  {
	@Autowired
	 SavingsService savingsService;
	// http://localhost:28080/savingsuser/addSavingsUser
	@RequestMapping(value = "/addSavingsUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public SavingsUser addSavingsUser(@RequestBody SavingsUser savingsuser)
	{
		return this.savingsService.addSavingsUser(savingsuser);
	}
}






















/*package com.dxc.integratedbank.controller;
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
import com.dxc.integratedbank.entity.SavingsUser;

import com.dxc.integratedbank.service.SavingsService;

@RestController
@RequestMapping("/savingsuser")
public class SavingsController  {
	@Autowired
	 SavingsService savingsService;
	// http://localhost:28080/savingsuser/addSavingsUser
	@RequestMapping(value = "/addSavingsUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public SavingsUser addSavingsUser(@RequestBody SavingsUser savingsuser) throws Exception {
		int tempamount = savingsuser.getEnteramount();
		if(tempamount==500) {
			SavingsUser userobj=savingsService.fetchSavingsUserByEnterAmount(tempamount);
			if(userobj!=null)
			{
				throw new Exception("savings amount is"+tempamount+"please enter correct amount");
			}	
		}
		SavingsUser userObj=null;
		userObj=savingsService.addSavingsUser(savingsuser);
		return userObj;
		
		
	
		
		
	}
	}*/
