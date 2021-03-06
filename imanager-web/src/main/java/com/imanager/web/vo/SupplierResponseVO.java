package com.imanager.web.vo;

public class SupplierResponseVO {

	private String supplierId;
	private String supplierName;
	private String ownerName;
	private String contact;
	private AddressResponseVO address;

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
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

	public AddressResponseVO getAddress() {
		return address;
	}

	public void setAddress(AddressResponseVO address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "SupplierResponseVO [supplierId=" + supplierId + ", supplierName=" + supplierName + ", ownerName="
				+ ownerName + ", contact=" + contact + ", address=" + address + "]";
	}

}
