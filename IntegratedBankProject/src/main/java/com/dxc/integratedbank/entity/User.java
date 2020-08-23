
package com.dxc.integratedbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bankinfo")
public class User 
{
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "username", nullable = true, length = 255)
	private String username;

	@Column(name = "phone", nullable = true, length = 255)
	private Integer phone;
	
	@Column(name = "password", nullable = true, length = 255)
	private String password;

	@Column(name = "email", nullable = true, length = 255)
	private String email;
	
	@Column(name = "dob", nullable = true, length = 5)
	private String dob;
	
	@Column(name = "aadharno", nullable = true, length = 255)
	private Integer aadharno;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", phone=" + phone + ", password=" + password + ", email="
				+ email + ", dob=" + dob + ", aadharno=" + aadharno + ", customerid=" + customerid + "]";
	}

	public User() {
		super();
	}

	public User(Integer id, String username, Integer phone, String password, String email, String dob, Integer aadharno,
			Long customerid) {
		super();
		this.id = id;
		this.username = username;
		this.phone = phone;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.aadharno = aadharno;
		this.customerid = customerid;
	}

	
	/*public User(int i, String string) {
		// TODO Auto-generated constructor stub
	}*/


	@Column(name = "customerid", nullable = true, length = 255)
	private Long customerid;

	
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

	
	public Integer getPhone() {
		return phone;
	}

	
	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	
	public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getEmail() {
		return email;
	}

	
	public void setEmail(String email) {
		this.email = email;
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

	
	public Long getCustomerid() {
		return customerid;
	}

	
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
}

	
	









/*package com.dxc.integratedbank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bankinfo")
public class User 
{
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "username", nullable = true, length = 255)
	private String name;

	@Column(name = "phone", nullable = true, length = 255)
	private Integer phone;
	
	@Column(name = "password", nullable = true, length = 255)
	private String password;

	@Column(name = "email", nullable = true, length = 255)
	private String email;
	
	@Column(name = "DOB", nullable = true, length = 5)
	private Double dob;
	
	@Column(name = "AadharNo", nullable = true, length = 255)
	private Integer aadharno;
	@Column(name = "Customerid", nullable = true, length = 255)
	private long customerid;

	public User() {
		
	}
	
	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}

	public User(Integer id, String name, Integer phone, String password, String email, Double dob, Integer aadharno) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.aadharno = aadharno;
	}

	public Integer getId() {
		return id;
	}

	public User(Integer id, String name, Integer phone, String password, String email, Double dob, Integer aadharno,
			long customerid) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.aadharno = aadharno;
		this.customerid = customerid;
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getDob() {
		return dob;
	}

	public void setDob(Double dob) {
		this.dob = dob;
	}

	public Integer getAadharno() {
		return aadharno;
	}

	public void setAadharno(Integer aadharno) {
		this.aadharno = aadharno;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", password=" + password + ", email=" + email
				+ ", dob=" + dob + ", aadharno=" + aadharno + ", customerid=" + customerid + "]";
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone + ", password=" + password + ", email=" + email
				+ ", dob=" + dob + ", aadharno=" + aadharno + "]";
	}
	
	
	
	

}*/
