package model;

public class Discount {
	private static final double businessDiscountRate = 0.10;
	private static final double privateDiscountAmount = 45;

	public double getAmountWithDiscount(int customerType, double saleOrderAmount) {
		if (customerType == 2) { // Use 2 for "Business" customer
			if (saleOrderAmount >= 2500) {
				return applyBusinessDiscount(saleOrderAmount);
			}
		} else if (customerType == 1) { // Use 1 for "private" customer type
			if (saleOrderAmount >= 1500) {
				return applyPrivateDiscount(saleOrderAmount);
			}
		}
		return saleOrderAmount; 
	}

	private double applyBusinessDiscount(double amount) {
		return amount - (amount * businessDiscountRate);
	}

	private double applyPrivateDiscount(double amount) {
		return amount - privateDiscountAmount;
	}
}
