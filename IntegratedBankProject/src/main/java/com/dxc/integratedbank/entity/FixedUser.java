package com.dxc.integratedbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fixeduser")
public class FixedUser
{
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "username", nullable = true, length = 255)
	private String username;
	@Column(name = "dob", nullable = true, length = 255)
	private String dob;
	@Column(name = "aadharno", nullable = true, length = 255)
	private Integer aadharno;
	@Column(name = "timeperiod", nullable = true, length = 255)
	private Long timeperiod;
	@Column(name = "enteramount", nullable = true, length = 255)
	private Long enteramount;
	

	public FixedUser()
	{
		super();
	}
	
	public FixedUser(Integer id, String username,String dob, Integer aadharno, Long timeperiod, Long enteramount)
	{
		super();
		this.id = id;
		this.username = username;
		this.dob=dob;
		this.aadharno = aadharno;
		this.timeperiod = timeperiod;
		this.enteramount = enteramount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Integer getAadharno() {
		return aadharno;
	}

	public void setAadharno(Integer aadharno) {
		this.aadharno = aadharno;
	}

	public Long getTimeperiod() {
		return timeperiod;
	}

	public void setTimeperiod(Long timeperiod) {
		this.timeperiod = timeperiod;
	}

	public Long getEnteramount() {
		return enteramount;
	}

	public void setEnteramount(Long enteramount) {
		this.enteramount = enteramount;
	}

	@Override
	public String toString() {
		return "FixedUser [id=" + id + ", username=" + username + ", dob=" + dob + ", aadharno=" + aadharno
				+ ", timeperiod=" + timeperiod + ", enteramount=" + enteramount + "]";
	}
	
}