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
	@Column(name = "name", nullable = true, length = 255)
	private String name;
	@Column(name = "dob", nullable = true, length = 255)
	private String dob;

	@Column(name = "phoneno", nullable = true, length = 255)
	private Long phoneno;
	
	@Column(name = "aadharno", nullable = true, length = 255)
	private Integer aadharno;
	
	@Column(name = "pancard", nullable = true, length = 255)
	private Integer pancard;
	
	@Column(name = "address", nullable = true, length = 255)
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}

	public Integer getAadharno() {
		return aadharno;
	}

	public void setAadharno(Integer aadharno) {
		this.aadharno = aadharno;
	}

	public Integer getPancard() {
		return pancard;
	}

	public void setPancard(Integer pancard) {
		this.pancard = pancard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public SavingsUser(Integer id, String name, String dob, Long phoneno, Integer aadharno, Integer pancard,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.phoneno = phoneno;
		this.aadharno = aadharno;
		this.pancard = pancard;
		this.address = address;
	}

	public SavingsUser() {
		super();
	}

	@Override
	public String toString() {
		return "SavingsUser [id=" + id + ", name=" + name + ", dob=" + dob + ", phoneno=" + phoneno + ", aadharno="
				+ aadharno + ", pancard=" + pancard + ", address=" + address + "]";
	}
  
}