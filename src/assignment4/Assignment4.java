package assignment4;

/**
 *
 * @author taylorwu
 */
public class Assignment4 {

    public static void main(String[] args) {
        FormLetterWriter letter = new FormLetterWriter("Taylor", "Wu");
        letter.displaySalutation();
        letter.displaySalutation2();
        
        Billing bill = new Billing(12.32, 4, 4.5);
        bill.computeBilling();
        bill.computeBilling2();
        bill.computeBilling3();
    }
    
}
