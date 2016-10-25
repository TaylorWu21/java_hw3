package assignment4;

/**
 *
 * @author taylorwu
 */
public class Assignment4 {

    public static void main(String[] args) {
        displaySalutation("Wu");
        displayEnd();
        displaySalutation("Wu", "Taylor");
        displayEnd();

        computeBilling(12.00);
        computeBilling(12.00, 5);
        computeBilling(12.00, 5, 20.00);
    }
    
    public static void computeBilling(double price) {
        double total = price * 1.08;
        System.out.println("Your total with 8% tax is $" + total);
    }
    
    public static void computeBilling(double price, int quantity) {
        double total = (price * quantity) * 1.08;
        System.out.println("Your total for these " + quantity + " item is $" + total);
    }
    
    public static void computeBilling(double price, int quantity, double coupon) {
        double total = (price * quantity - coupon) * 1.08;
        System.out.println("Your total with a " + coupon + " coupon is $" + total);
    }
    
    
    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName);
    }
    
    public static void displaySalutation(String lastName, String firstName) {
        System.out.println("Dear " + firstName + " " + lastName);
    }
    
    public static void displayEnd() {
        System.out.println("Thank you for your recent order.");
    }
}
