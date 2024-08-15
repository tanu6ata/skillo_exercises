package skillo.lection4;

import java.util.Scanner;

public class SalesRevenue {

    public static void main(String[] args) {

        calcSalesRevenue();
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

}
