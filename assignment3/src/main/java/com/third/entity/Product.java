package com.third.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
(name="product_table")
public class Product {
	@Id
	public int Id;
	public String Name;
	public int Price;
//get and set methods
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public int getId() {
		return Id;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}

	public void setPrice(int Price) {
		this.Price = Price;
	}
	public int getPrice() {
		return Price;
	}

	public Product(int Id, String Name, int Price) {
		super();
		this.Id = Id;
		this.Name = Name;
		this.Price = Price;
	}

	public Product() {
		super();
	}

	@Override
	//for showing the output
	public String toString() {
		return "Product [Id=" + Id + ", Name=" + Name + ", Price=" + Price + "]";
	}

}
