package com.imanager.service.vo;

public class CustomerVO extends BaseVO {

	private Long customerId;
	private String customerName;
	private String contact;
	private AddressVO address;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
		return "CustomerVO [customerId=" + customerId + ", customerName=" + customerName + ", contact=" + contact
				+ ", address=" + address + "]";
	}
}
