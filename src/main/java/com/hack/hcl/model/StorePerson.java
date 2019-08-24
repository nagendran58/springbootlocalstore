package com.hack.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="store_person")
public class StorePerson {
	@Id
	@Column(name="person_id")
	private Integer personId;
	
	@Column(name="person_name")
	private String personName;
	
	@Column(name="person_username")
	private String personUserName;
	
	@Column(name="person_pwd")
	private String personPassword;
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id", referencedColumnName = "person_id")
	private Roles roles;*/
	/**
	 * @return the personId
	 */
	public Integer getPersonId() {
		return personId;
	}
	/**
	 * @param personId the personId to set
	 */
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * @return the personUserName
	 */
	public String getPersonUserName() {
		return personUserName;
	}
	/**
	 * @param personUserName the personUserName to set
	 */
	public void setPersonUserName(String personUserName) {
		this.personUserName = personUserName;
	}
	/**
	 * @return the personPassword
	 */
	public String getPersonPassword() {
		return personPassword;
	}
	/**
	 * @param personPassword the personPassword to set
	 */
	public void setPersonPassword(String personPassword) {
		this.personPassword = personPassword;
	}
	/**
	 * @return the roles
	 */
	
	
	
}
