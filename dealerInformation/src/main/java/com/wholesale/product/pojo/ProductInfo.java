package com.wholesale.product.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ProductInfo")
public class ProductInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer piid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pid")
	private Product product;
	
	private String name;
	
	@ManyToOne
    @JoinColumn(name = "pid")
    private ProductSize productSize;
	
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "comid")
	private ProductCompany productComp;
	
	private String status;
	
	private String path;

	public Integer getPiid() {
		return piid;
	}

	public void setPiid(Integer piid) {
		this.piid = piid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductSize getProductSize() {
		return productSize;
	}

	public void setProductSize(ProductSize productSize) {
		this.productSize = productSize;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductCompany getProductComp() {
		return productComp;
	}

	public void setProductComp(ProductCompany productComp) {
		this.productComp = productComp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
	

}
