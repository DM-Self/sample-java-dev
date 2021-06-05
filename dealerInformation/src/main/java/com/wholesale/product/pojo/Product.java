package com.wholesale.product.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	
	@OneToOne(mappedBy = "product")
	private ProductInfo pinfo;
	
	private Integer pcid;
	
	private String pcode ;
	
	private String ptype;
	
	@OneToMany(mappedBy = "product" )
	private List<ProductSize> productSize;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public Integer getPcid() {
		return pcid;
	}

	public void setPcid(Integer pcid) {
		this.pcid = pcid;
	}

	public List<ProductSize> getProductSize() {
		return productSize;
	}

	public void setProductSize(List<ProductSize> productSize) {
		this.productSize = productSize;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public ProductInfo getPinfo() {
		return pinfo;
	}

	public void setPinfo(ProductInfo pinfo) {
		this.pinfo = pinfo;
	}
	
	public void addSize(ProductSize p_productSize) {
		
		if( null == productSize ) {
			productSize = new ArrayList<>();
		}	
		
		productSize.add(p_productSize);
		
		p_productSize.setProduct(this);
	}
	


}
