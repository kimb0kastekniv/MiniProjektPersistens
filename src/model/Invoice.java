package model;

import java.util.Date;

public class Invoice {
	private int invoiceId;
	private int paymentDate;
	private int amount;

	public Invoice(int invoiceId, int paymentDate, int amount) {
		this.invoiceId = invoiceId;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	// Getters and Setters
	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public int getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(int paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
