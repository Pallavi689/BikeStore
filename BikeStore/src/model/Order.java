package model;

import java.sql.Date;

public class Order {
	private int customerId;
    private int orderStatus;
    private Date orderDate;
    private Date requiredDate;
    private int storeId;
    private int staffId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getRequiredDate() {
		return requiredDate;
	}
	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public Order(int customerId, int orderStatus, Date orderDate, Date requiredDate, int storeId, int staffId) {
		super();
		this.customerId = customerId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.storeId = storeId;
		this.staffId = staffId;
	}
	@Override
	public String toString() {
		return "Order [customerId=" + customerId + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate
				+ ", requiredDate=" + requiredDate + ", storeId=" + storeId + ", staffId=" + staffId + "]";
	}
    
    
}
