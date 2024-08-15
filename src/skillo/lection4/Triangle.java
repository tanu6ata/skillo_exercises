package skillo.lection4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        checkTriangle();
    }
    public static void checkTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first angle's degrees: ");
        double angle1 = scanner.nextDouble();
        System.out.println("Enter the second angle's degrees: ");
        double angle2 = scanner.nextDouble();
        System.out.println("Enter the third angle's degrees: ");
        double angle3 = scanner.nextDouble();

        double anglesSum = angle1 + angle2 + angle3;

        if (anglesSum != 180) {
            System.out.println("Triangle is not possible.");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("The type of triangle is: Equilateral");

        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println("The type of triangle is: Right-angled");

        } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            System.out.println("The type of triangle is: Obtuse");

        } else if (angle1 < 90 || angle2 < 90 || angle3 < 90) {
            System.out.println("The type of triangle is: Acute");

        } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            System.out.println("The type of triangle is: Isosceles"); // it never enters here

        } else {
            System.out.println("The type of triangle is: Multifaceted"); // it never enters here
        }
    }

}
