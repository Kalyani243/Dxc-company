package com.dxc.integratedbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.dxc.integratedbank.entity.FixedUser;
import com.dxc.integratedbank.entity.SavingsUser;
import com.dxc.integratedbank.service.FixedService;

@RestController
@RequestMapping("/fixeduser")
public class FixedController  {
	@Autowired
	 private FixedService fixedService;
	// http://localhost:28080/fixeduser/addFixedUser
	/*@RequestMapping(value = "/addFixedUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FixedUser addFixedUser (@RequestBody FixedUser fixeduser) {
		return this.fixedService.addFixedUser(fixeduser);
	}*/
	@PostMapping("/addFixedUser")
	public  FixedUser addFixedUser(@RequestBody FixedUser fixeduser)
	{
		return fixedService.addFixedUser(fixeduser);
	}
	@GetMapping("/fixedname")
	public FixedUser fetchByName(String name )
	{
		return fixedService.fetchByName(name).get();
	}
	
}

















/*package com.dxc.integratedbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.integratedbank.entity.FixedUser;
import com.dxc.integratedbank.entity.SavingsUser;
import com.dxc.integratedbank.service.FixedService;

@RestController
@RequestMapping("/fixeduser")
public class FixedController  {
	@Autowired
	FixedService fixedService;
	// http://localhost:28080/bank/addUser
	@RequestMapping(value = "/addFixedUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public FixedUser addFixedUser (@RequestBody FixedUser fixeduser) {
		int ROI=5;
		long tempamount = fixeduser.getEnteramount();
		long tempyears = fixeduser.getTimeperiod();
		if(tempamount> 5000 && tempyears >= 4) {
			 long TotalFDAmount = tempamount + (ROI*tempamount);
			for(int i=2; i<=4; i++)
				TotalFDAmount = TotalFDAmount + (ROI*TotalFDAmount);
			System.out.println("Your Total FD Amount aftyears will be "+TotalFDAmount);
		
	}
		FixedUser userObj=null;
		userObj=fixedService.addFixedUser(fixeduser);
		return userObj;
	}
}*/
