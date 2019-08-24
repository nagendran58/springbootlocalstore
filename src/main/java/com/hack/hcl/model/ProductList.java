package com.hack.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="product_list")
public class ProductList {

	@Id
	@Column(name="pro_id")
	private Integer productId;
	
	@Column(name="pro_type")
	private String productType;
	
	@Column(name="pro_name")
	private String productName;
	
	@Column(name="pro_brand")
	private Integer productBrand;
	
	@Column(name="pro_qty")
	private String productQuantity;
	
	@Column(name="pro_price")
	private Integer productPrice;
	
	
}
