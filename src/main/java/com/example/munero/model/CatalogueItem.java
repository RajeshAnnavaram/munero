package com.example.munero.model;

public class CatalogueItem {
    private String name;
    private double price;
	public CatalogueItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CatalogueItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CatalogueItem [name=" + name + ", price=" + price + "]";
	}

    
}
