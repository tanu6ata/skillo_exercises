package skillo.lection4;

import java.util.Scanner;

public class SalesRevenue {

    public static void main(String[] args) {

        calculateRevenue();
    }

    public static void calcSalesRevenue() {
        Scanner scanner = new Scanner(System.in);

        double revenue;
        double unitPrice;
        int quantity;
        double discountRate;
        double discountAmount;
        double discountedRevenue;


        System.out.println("Enter unit price:");
        unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity:");
        quantity = scanner.nextInt();

        revenue = unitPrice * quantity;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        } else {
            discountRate = 0;
        }

        discountAmount = revenue * discountRate;
        discountedRevenue = revenue - discountAmount;

        System.out.println("The total revenue from sale is: " + discountedRevenue + "$");
        System.out.println("The discount from sale is: " + discountAmount + "$");
    }

    public static void calculateRevenue() {
        double revenue;
        double unitPrice;
        int quantity;
        double discountRate;
        double discount;
        String revenueMessage = "The revenue from sale: ";
        String discountMessage = "Discount: ";
        char dollar = '$';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter unit price:");
        unitPrice = scanner.nextDouble();

        System.out.println("Please enter quantity:");
        quantity = scanner.nextInt();

        revenue = unitPrice * quantity;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        } else {
            discountRate = 0;
        }

        discount = revenue * discountRate;
        revenue = revenue - discount;

        System.out.println(revenueMessage + revenue + dollar);
        System.out.println(discountMessage + discount + dollar);
    }

}
