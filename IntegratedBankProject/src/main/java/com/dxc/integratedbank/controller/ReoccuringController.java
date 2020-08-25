/*import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.integratedbank.entity.FixedUser;
import com.dxc.integratedbank.entity.ReoccuringUser;
import com.dxc.integratedbank.service.ReoccuringService;

@RestController
@RequestMapping("/reoccuringuser")
public class ReoccuringController  {
	@Autowired
	// http://localhost:28080/fixeduser/addFixedUser
		@RequestMapping(value = "/addReoccuringUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
		public ReoccuringUser addReoccuringUser (@RequestBody ReoccuringUser reoccuringuser) {
			return this.reoccuringservice.addReoccuringUser(reoccringuser);
		}
	
}*/


	
	












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

import com.dxc.integratedbank.entity.FixedUser;
import com.dxc.integratedbank.entity.ReoccuringUser;

import com.dxc.integratedbank.service.ReoccuringService;

@RestController
@RequestMapping("/reoccuringuser")
public class ReoccuringController  {
	@Autowired
	ReoccuringService reoccuringService;
	// http://localhost:28080/bank/addUser
	@RequestMapping(value = "/addReoccuringUser", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ReoccuringUser addReoccuringUser(@RequestBody ReoccuringUser reoccuringuser) {
		int amount=5000;
		int months=4;
		int ROI=5;
		int tempamount = reoccuringuser.getEnteramount();
		int tempmonths = reoccuringuser.getTimeperiod();
		if(tempamount>amount  && tempmonths >= months) {
			 long TotalRDAmount = tempamount*(ROI/100)*(1/12)*(tempmonths*(tempmonths+1))/2;
			
			System.out.println("Your Total RD Amount  will be "+TotalRDAmount);
			//return this.reoccuringService.addReoccuringUser(reoccuringuser);
	}
		FixedUser userObj=null;
		userObj=reoccuringService.addReoccuringUser(reoccuringuser);
		return userObj;
	}
}*/

