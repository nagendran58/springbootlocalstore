package com.hack.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="store_list")
//@NamedQuery(name="store_list.getStoreListByStatus", query="select a from store_list a where a.appr_status = :appr_status")
public class StoreList {

	@Id
	@GeneratedValue
	@Column(name="store_id")
	private Integer storeId;
	@Column(name="store_name")
	private String storeName;
	@Column(name="store_addr")
	private String storeAddress;
	@Column(name="store_pin")
	private String storePin;
	@Column(name="store_tag")
	private String storeTag;
	@Column(name="appr_status")
	private String approvalStatus;
	@Column(name="store_remarks")
	private String remarks;
	/*@OneToMany
	private List<ProductList> productList;*/
	/**
	 * @return the storeId
	 */
	public Integer getStoreId() {
		return storeId;
	}
	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	/**
	 * @return the storeName
	 */
	public String getStoreName() {
		return storeName;
	}
	/**
	 * @param storeName the storeName to set
	 */
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	/**
	 * @return the storeAddress
	 */
	public String getStoreAddress() {
		return storeAddress;
	}
	/**
	 * @param storeAddress the storeAddress to set
	 */
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	/**
	 * @return the storePin
	 */
	public String getStorePin() {
		return storePin;
	}
	/**
	 * @param storePin the storePin to set
	 */
	public void setStorePin(String storePin) {
		this.storePin = storePin;
	}
	/**
	 * @return the storeTag
	 */
	public String getStoreTag() {
		return storeTag;
	}
	/**
	 * @param storeTag the storeTag to set
	 */
	public void setStoreTag(String storeTag) {
		this.storeTag = storeTag;
	}
	/**
	 * @return the approvalStatus
	 */
	public String getApprovalStatus() {
		return approvalStatus;
	}
	/**
	 * @param approvalStatus the approvalStatus to set
	 */
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	
}
