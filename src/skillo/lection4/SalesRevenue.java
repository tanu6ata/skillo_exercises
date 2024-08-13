package skillo.lection4;

import java.util.Scanner;

public class SalesRevenue {

    public static void main(String[] args) {
        calcSalesRevenue();
    }

    public static void calcSalesRevenue() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter unit price:");
        double unitPrice = scanner.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        double discountRate;
        if (quantity<100){
            discountRate=0;
        }
        if (quantity >= 100 && quantity < 120) {
            discountRate = 15 / 100;
        }
        if (quantity >= 120){
            discountRate = 20 / 100;
        }


        switch (quantity) {
            case 1:
                System.out.println("Case1 ");
                break;
            case 2:
                System.out.println("Case2 ");
                break;
            case 3:
                System.out.println("Case3 ");
                break;
            default:
                System.out.println("Default ");
        }

        double salesAmount = quantity * unitPrice;
//        double discountAmount = salesAmount - (salesAmount * discountRate);

        System.out.println("The revenue from sale: "  + "$");
//        System.out.println("Discount: " + discountAmount + "$");


    }

}
