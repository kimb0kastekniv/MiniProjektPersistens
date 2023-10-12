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
	private int discount;
	private ArrayList<Product> productsInOrder;
	
	private static final double businessDiscountRate = 0.10;
	private static final double privateDiscountAmount = 45;

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
	}

	public SaleOrder() {
		saleOrderLine = new ArrayList<>();
	}

	public void createSaleOrderLine(SaleOrder saleOrderId, Product productId, int quantity, double salePrice) {
		SaleOrderLine sol = new SaleOrderLine(this, productId, quantity, salePrice);
		saleOrderLine.add(sol);
	}

	public double getAmountWithDiscount(double input) {
        int customerType = customer.getCustomerType();
        double saleOrderAmount = input;

        // Apply the discount based on customer type and sale order amount
        if (customerType == 2) { // Business customer
            if (saleOrderAmount >= 2500) {
                saleOrderAmount = applyBusinessDiscount(saleOrderAmount);
            }
        } else if (customerType == 1) { // Private customer
            if (saleOrderAmount >= 1500) {
                saleOrderAmount = applyPrivateDiscount(saleOrderAmount);
            }
        }

        // Apply the flat rate discount
        saleOrderAmount -= discount;

        return saleOrderAmount;
    }

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
