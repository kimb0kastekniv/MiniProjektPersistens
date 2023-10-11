package model;

public class SaleOrderLine {
	private SaleOrder saleOrderId; // Composite primary key with product_id
	private Product productId; // Composite primary key with saleOrderId
	private int quantity;
	private double salePrice;

	// Getters and Setters
	public SaleOrder getSaleOrderId() {
		return saleOrderId;
	}

	public void setSaleOrderId(SaleOrder saleOrderId) {
		this.saleOrderId = saleOrderId;
	}

	public Product getProductId() {
		return productId;
	}

	public void setProductId(Product productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
}
