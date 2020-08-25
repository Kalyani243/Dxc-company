

package com.dxc.integratedbank.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reoccuring")
public class ReoccuringUser
{
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "name", nullable = true, length = 255)
	private String name;
	@Column(name = "account_no", nullable = true, length = 255)
	private String account_no;
	@Column(name = "amount", nullable = true, length = 255)
	private String amount;
	@Column(name = "tenture", nullable = true, length = 255)
	private Integer tenture;
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
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public Integer getTenture() {
		return tenture;
	}
	public void setTenture(Integer tenture) {
		this.tenture = tenture;
	}
	public ReoccuringUser(Integer id, String name, String account_no, String amount, Integer tenture) {
		super();
		this.id = id;
		this.name = name;
		this.account_no = account_no;
		this.amount = amount;
		this.tenture = tenture;
	}
	public ReoccuringUser() {
		super();
	}
	@Override
	public String toString() {
		return "ReoccuringUser [id=" + id + ", name=" + name + ", account_no=" + account_no + ", amount=" + amount
				+ ", tenture=" + tenture + "]";
	}
}
	

