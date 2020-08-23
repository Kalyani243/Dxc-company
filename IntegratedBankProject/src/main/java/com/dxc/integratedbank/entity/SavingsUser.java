package com.dxc.integratedbank.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "savingsuser")
public class SavingsUser {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "username", nullable = true, length = 255)
	private String username;
	@Column(name = "aadharno", nullable = true, length = 255)
	private Integer aadharno;
	@Column(name = "customerid", nullable = true, length = 255)
	private Long customerid;
	@Column(name = "enteramount", nullable = true, length = 255)
	private Long enteramount;
	public SavingsUser(Integer id, String username, Integer aadharno, Long customerid, Long enteramount) {
		super();
		this.id = id;
		this.username = username;
		this.aadharno = aadharno;
		this.customerid = customerid;
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
	
	public Integer getAadharno() {
		return aadharno;
	}
	
	public void setAadharno(Integer aadharno) {
		this.aadharno = aadharno;
	}
	
	public Long getCustomerid() {
		return customerid;
	}
	
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	
	public Long getEnteramount() {
		return enteramount;
	}
	
	public void setEnteramount(Long enteramount) {
		this.enteramount = enteramount;
	}
	public SavingsUser() {
		super();
	}
	
	@Override
	public String toString() {
		return "SavingsUser [id=" + id + ", username=" + username + ", aadharno=" + aadharno + ", customerid="
				+ customerid + ", enteramount=" + enteramount + "]";
	}
	
	


}
