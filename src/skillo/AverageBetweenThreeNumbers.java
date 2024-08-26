package lection_8;

import java.util.Scanner;

public class AverageBetweenThreeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the fist number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Please enter the third number: ");
        int thirdNum = scanner.nextInt();
        System.out.print("The average value is " + findAverage(firstNum, secondNum, thirdNum)+"\n" );
    }

    public static int findAverage(int firstNum, int secondNum, int thirdNum) {
        // Write a Java method to compute the average of three numbers.
        return (firstNum + secondNum + thirdNum) / 3;
    }
}
