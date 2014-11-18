package com.koitoer.springangular.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Persistence class for TmpVirtualSku table.
 * 
 * @author David Herz Gutierrez
 * @since Jan 10, 2014
 * 
 */
@Entity
@Table(name = "TMPVIRTUALSKU")
public class VirtualSkuEntity {

	@Id
	@Column(name = "virtualsku")
	private String virtualSku;

	@Column(name = "Sku")
	private String sku;

	@Column(name = "Custitemnum")
	private String custItemNum;

	@Column(name = "Custitemdesc")
	private String custItemDesc;

	@Column(name = "Uom")
	private String uom;

	@Column(name = "Uomconv", columnDefinition = "float")
	private Double uomConv;

	/**
	 * Constructs an instance of VirtualSkuEntity object.
	 */
	public VirtualSkuEntity() {
		super();
	}

	/**
	 * 
	 * Constructs an instance of VirtualSkuEntity object.
	 * 
	 * @param virtualSku
	 */
	public VirtualSkuEntity(final String virtualSku) {

		super();
		this.virtualSku = virtualSku;
	}

	public String getVirtualSku() {
		return virtualSku;
	}

	public void setVirtualSku(final String virtualSku) {
		this.virtualSku = virtualSku;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(final String sku) {
		this.sku = sku;
	}

	public String getCustItemNum() {
		return custItemNum;
	}

	public void setCustItemNum(final String custItemNum) {
		this.custItemNum = custItemNum;
	}

	public String getCustItemDesc() {
		return custItemDesc;
	}

	public void setCustItemDesc(final String custItemDesc) {
		this.custItemDesc = custItemDesc;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(final String uom) {
		this.uom = uom;
	}

	public Double getUomConv() {
		return uomConv;
	}

	public void setUomConv(final Double uomConv) {
		this.uomConv = uomConv;
	}

	@Override
	public String toString() {
		return "TmpVirtualSkuEntity [virtualSku=" + virtualSku + ", sku=" + sku + ", custItemNum=" + custItemNum
				+ ", custItemDesc=" + custItemDesc + ", uom=" + uom + ", uomConv=" + uomConv + "]";
	}

	@Override
	public int hashCode() {
		return 13;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(final Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final VirtualSkuEntity other = (VirtualSkuEntity) obj;
		if (virtualSku == null) {
			if (other.virtualSku != null) {
				return false;
			}
		}
		else if (!virtualSku.equals(other.virtualSku)) {
			return false;
		}
		return true;
	}
}
