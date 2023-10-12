package model;

import java.util.ArrayList;

public class SaleOrder {
	private int saleOrderId;
	private int date;
	private double amount;
	private boolean deliveryStatus;
	private int deliveryDate;
	private Invoice invoice; // Foreign key to Invoice table
	private Customer customer; // Foreign key to Customer table

	private ArrayList<SaleOrderLine> saleOrderLine;
	private Discount discount;
	private ArrayList<Product> productsInOrder;

	public SaleOrder(int saleOrderId, int date, double amount, boolean deliveryStatus, int deliveryDate,
			Invoice invoice, Customer customer) {
		this.saleOrderId = saleOrderId;
		this.date = date;
		this.amount = amount;
		this.deliveryStatus = deliveryStatus;
		this.deliveryDate = deliveryDate;
		this.invoice = invoice;
		this.customer = customer;
		saleOrderLine = new ArrayList<SaleOrderLine>();
		discount = new Discount();
		productsInOrder = new ArrayList<>();
	}

	public SaleOrder() {
		saleOrderLine = new ArrayList<>();
		discount = new Discount();
	}

	public void createSaleOrderLine(SaleOrder saleOrderId, Product productId, int quantity, double salePrice) {
		SaleOrderLine sol = new SaleOrderLine(this, productId, quantity, salePrice);
		saleOrderLine.add(sol);
	}

	public double getAmountWithDiscount(double input) {
		int customerType = customer.getCustomerType();
		double saleOrderAmount = input;
		double amount = discount.getAmountWithDiscount(customerType, saleOrderAmount);
		return amount;
	}

	public ArrayList<SaleOrderLine> getSaleOrderLines() {
		return saleOrderLine;
	}

	public void setSaleOrderLines(ArrayList<SaleOrderLine> saleOrderLines) {
		saleOrderLine = saleOrderLines;
	}

	public void setCustomerToCurrentSaleOrder(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomerFromSaleCurrentOrder() {
		return customer;
	}

	public void setProductToCurrentSaleOrder(Product p) {
		// Assuming you have a collection to store products in the current order
		if (productsInOrder == null) {
			productsInOrder = new ArrayList<>();
		}
		productsInOrder.add(p);
	}
	public ArrayList<Product> getProductsInSaleOrder() {
        return productsInOrder;
    }

	
	
	
	
	// Getters and Setters
	public int getSaleOrder() {
		return saleOrderId;
	}

	public void setSaleOrderId(int saleOrderId) {
		this.saleOrderId = saleOrderId;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public int getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(int deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public Invoice getInvoiceId() {
		return invoice;
	}

	public void setInvoiceId(Invoice invoice) {
		this.invoice = invoice;
	}

	public Customer getCustomerId() {
		return customer;
	}

	public void setCustomerId(Customer customer) {
		this.customer = customer;
	}
}
