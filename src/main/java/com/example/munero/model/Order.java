package com.example.munero.model;

public class Order {
    private String item;
    private int quantity;
    private double totalPrice;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the totalPrice
	 */
	public double getTotalPrice() {
		return totalPrice;
	}
	/**
	 * @param totalPrice the totalPrice to set
	 */
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public Order(String item, int quantity, double totalPrice) {
		super();
		this.item = item;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Order [item=" + item + ", quantity=" + quantity + ", totalPrice=" + totalPrice + "]";
	}


}
