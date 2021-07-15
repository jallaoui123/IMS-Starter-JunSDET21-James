package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Order {
	
	private Long id;
	private String orderName;
	private String orderStatus;
	private Double price;
	
	public Order(Long id, String orderName, String orderStatus, Double price) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.orderStatus = orderStatus;
		this.price = price;
	}

	

	public Order(String orderName, String orderStatus, Double price) {
		super();
		this.orderName = orderName;
		this.orderStatus = orderStatus;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + ", orderStatus=" + orderStatus + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, orderName, orderStatus, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(id, other.id) && Objects.equals(orderName, other.orderName)
				&& Objects.equals(orderStatus, other.orderStatus) && Objects.equals(price, other.price);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
		
	}


}
	
	

	

	
