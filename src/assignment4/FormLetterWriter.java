/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

/**
 *
 * @author taylorwu
 */
class FormLetterWriter {
    private String firstName;
    private String lastName;
    private String end = "Thank you for your recent order.";
    
    public FormLetterWriter(String first, String last) {
        firstName = first;
        lastName = last;
    }
    
    public void displaySalutation() {
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println(end);
    }
    
    public void displaySalutation2() {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println(end);
    }
}
