package model;

public class SaleOrder {
	private int saleOrderId;
	private int date;
	private int amount;
	private boolean deliveryStatus;
	private int deliveryDate;
	private Invoice invoice; // Foreign key to Invoice table
	private Customer customer; // Foreign key to Customer table

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

	public int getAmount() {
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
