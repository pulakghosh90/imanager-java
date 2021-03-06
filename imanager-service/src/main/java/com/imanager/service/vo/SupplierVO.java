package com.imanager.service.vo;

public class SupplierVO extends BaseVO {

	private Long supplierId;
	private String supplierName;
	private String ownerName;
	private String contact;
	private AddressVO address;

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public AddressVO getAddress() {
		return address;
	}

	public void setAddress(AddressVO address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SupplierVO [supplierId=" + supplierId + ", supplierName=" + supplierName + ", ownerName=" + ownerName
				+ ", contact=" + contact + ", address=" + address + "]";
	}

}
