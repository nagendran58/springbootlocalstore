package com.hack.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="customer")
public class StoreCustomer {
	@Id
	@Column(name="custid")
	private Integer custId;
	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="cust_mobile")
	private Integer custMobile;
	
	@Column(name="cust_addr")
	private String custAddr;

	/**
	 * @return the custId
	 */
	public Integer getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * @return the custMobile
	 */
	public Integer getCustMobile() {
		return custMobile;
	}

	/**
	 * @param custMobile the custMobile to set
	 */
	public void setCustMobile(Integer custMobile) {
		this.custMobile = custMobile;
	}

	/**
	 * @return the custAddr
	 */
	public String getCustAddr() {
		return custAddr;
	}

	/**
	 * @param custAddr the custAddr to set
	 */
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	
}
