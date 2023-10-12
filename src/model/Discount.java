package model;

public class Discount {
    // Define discount rules (you can expand this for more complex rules)
    private static final double businessDiscountRate = 0.10;
    private static final double privateDiscountAmount = 45;

    public double getAmountWithDiscount(String customerType, double saleOrderAmount) {
        if (customerType.equalsIgnoreCase("BusinessCustomer")) {
            if (saleOrderAmount >= 2500) {
                return applyBusinessDiscount(saleOrderAmount);
            }
        } else if (customerType.equalsIgnoreCase("private")) {
            if (saleOrderAmount >= 1500) {
                return applyPrivateDiscount(saleOrderAmount);
            }
        }
        return saleOrderAmount; // No applicable discount
    }

    private double applyBusinessDiscount(double amount) {
        return amount - (amount * businessDiscountRate);
    }

    private double applyPrivateDiscount(double amount) {
        return amount - privateDiscountAmount;
    }
}