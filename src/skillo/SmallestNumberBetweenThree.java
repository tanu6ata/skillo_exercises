package lection_8;

import java.util.Scanner;

public class SmallestNumberBetweenThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the fist number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Please enter the third number: ");
        int thirdNum = scanner.nextInt();
        System.out.print("The smallest number is " + findSmallestNumber(firstNum, secondNum, thirdNum)+"\n" );
    }

    public static int findSmallestNumber(int firstNum, int secondNum, int thirdNum) {
    // Write a Java method to find the smallest number among three numbers
        return Math.min(Math.min(firstNum, secondNum), thirdNum);
    }
}
