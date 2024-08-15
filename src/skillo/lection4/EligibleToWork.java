package skillo.lection4;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        checkWorkEligibility();
    }

    public static void checkWorkEligibility() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        if (age >= 16) {
            System.out.println("The person is eligible to work");
        } else {
            System.out.println("The person is not eligible to work");
        }
    }
}
