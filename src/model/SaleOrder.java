package model;

import java.sql.Date;
import java.util.ArrayList;

public class SaleOrder {
	private int saleOrderId;
	private Date date;
	private int amount;
	private boolean deliveryStatus;
	private Date deliveryDate;
	private int invoiceId; // Foreign key to Invoice table
	private int customerId; // Foreign key to Customer table

	private ArrayList<SaleOrderLine> saleOrderLine;
	private int discount;
	private ArrayList<Product> productsInOrder;

	private static final double businessDiscountRate = 0.10;
	private static final double privateDiscountAmount = 45;

	public SaleOrder(int saleOrderId, Date date, int amount, boolean deliveryStatus, Date deliveryDate,
			int invoiceId, int customerId) {
		this.saleOrderId = saleOrderId;
		this.date = date;
		this.amount = amount;
		this.deliveryStatus = deliveryStatus;
		this.deliveryDate = deliveryDate;
		this.invoiceId = invoiceId;
		this.customerId = customerId;
		saleOrderLine = new ArrayList<SaleOrderLine>();
	}

	public SaleOrder() {
		saleOrderLine = new ArrayList<>();
	}

	public void createSaleOrderLine(SaleOrder saleOrderId, Product productId, int quantity, double salePrice) {
		SaleOrderLine sol = new SaleOrderLine(this, productId, quantity, salePrice);
		saleOrderLine.add(sol);
	}
	/*
	public double getAmountWithDiscount(double input) {
		int customerType = customer.getCustomerType();
		double saleOrderAmount = input;

		// Apply the discount based on customer type and sale order amount
		if (customerType == 2) { // Business customer
			if (saleOrderAmount >= 1500) {
				saleOrderAmount = applyBusinessDiscount(saleOrderAmount);
			}
		} else if (customerType == 1) { // Private customer
			if (saleOrderAmount >= 2500) {
				saleOrderAmount = applyPrivateDiscount(saleOrderAmount);
			}
		}

		// Apply the flat rate discount
		saleOrderAmount -= discount;

		return saleOrderAmount;
	}
	*/

	private double applyBusinessDiscount(double amount) {
		return amount - (amount * businessDiscountRate);
	}

	private double applyPrivateDiscount(double amount) {
		return amount - privateDiscountAmount;
	}

	public ArrayList<SaleOrderLine> getSaleOrderLines() {
		return saleOrderLine;
	}

	public void setSaleOrderLines(ArrayList<SaleOrderLine> saleOrderLines) {
		saleOrderLine = saleOrderLines;
	}
	
	public void setCustomerToCurrentSaleOrder(int customer) {
		this.customerId = customerId;
	}
	public int getCustomerFromCurrentSaleOrder() {
		return customerId;
	}

	public void setProductToCurrentSaleOrder(Product product) {
		
	}

	// Getters and Setters
	public int getSaleOrder() {
		return saleOrderId;
	}

	public void setSaleOrderId(int saleOrderId) {
		this.saleOrderId = saleOrderId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
