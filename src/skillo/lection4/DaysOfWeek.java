package skillo.lection4;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        printDayOfWeek();
    }

    public static void printDayOfWeek() {

        int num = 8;
        switch (num) {
            case 1:
                System.out.println("The " + num + "-st day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + num + "-nd day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + num + "-rd day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + num + "-th day of the week is Thursday");
                break;
            case 5:
                System.out.println("The " + num + "-th day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + num + "-th day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + num + "-th day of the week is Sunday");
                break;
            default:
                System.out.println("Error: Invalid day range");
        }
    }
}
