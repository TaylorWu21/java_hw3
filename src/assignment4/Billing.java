package assignment4;

/**
 *
 * @author taylorwu
 */
class Billing {
    private static double TAX = 1.08;
    private double Price;
    private int Quantity;
    private double Coupon;
    
    public Billing(double price, int quantity, double coupon) {
        Price = price;
        Quantity = quantity;
        Coupon = coupon;
    }
    
    public void computeBilling() {
        double total = Price * TAX;
        System.out.println("Your total with 8% tax is $" + total);
    }
    
    public void computeBilling2() {
        double total = (Price * Quantity) * TAX;
        System.out.println("Your total for these " + Quantity + " item is $" + total);
    }
    
    public void computeBilling3() {
        double total = (Price * Quantity - Coupon) * TAX;
        System.out.println("Your total with a " + Coupon + " coupon is $" + total);
    }
    
}
