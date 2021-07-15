package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Item {
	
	private Long id;
	private String itemName;
	private String itemType;
	private Double price;
	public Long getId() {
		return id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemType=" + itemType + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, itemName, itemType, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id) && Objects.equals(itemName, other.itemName)
				&& Objects.equals(itemType, other.itemType) && Objects.equals(price, other.price);
	}
	public Item(Long id, String itemName, String itemType, Double price) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemType = itemType;
		this.price = price;
	}
	public Item(String itemName, String itemType, Double price) {
		super();
		this.itemName = itemName;
		this.itemType = itemType;
		this.price = price;
	}
	
	
	
	
	
	
	
	
}
