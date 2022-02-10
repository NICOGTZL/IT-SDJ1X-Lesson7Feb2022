//Exercise 1.05 In Denmark, the sales tax is 25%. Write a program that calculates and prints
//the tax and the total price of items that before the added tax cost 80, 140, and
//230 kr., respectively.

public class FifthQuestion {
    public static void main(String[] args){
        int salesTax = 25;
        int amount1 = 80;
        int amount2 = 140;
        int amount3 = 230;
        String bar = "________________________________________";

        System.out.println(bar);
        int totalAmount1 = (((amount1*salesTax)/100)+amount1);
        System.out.println("#1.\nAmount before taxes: " + amount1);
        System.out.println("» TOTAL (25% of VAT): " + totalAmount1 + " kr");

        System.out.println(bar);

        int totalAmount2 = (((amount2*salesTax)/100)+amount2);
        System.out.println("#2.\nAmount before taxes: " + amount2);
        System.out.println("» TOTAL (25% of VAT): " + totalAmount2 + " kr");

        System.out.println(bar);

        int totalAmount3 = (((amount3*salesTax)/100)+amount3);
        System.out.println("#3.\nAmount before taxes: " + amount3);
        System.out.println("» TOTAL (25% of VAT): " + totalAmount3 + " kr");

    }
}
