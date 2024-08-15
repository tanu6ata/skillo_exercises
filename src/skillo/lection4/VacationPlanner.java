package skillo.lection4;

import java.util.Scanner;

public class VacationPlanner {

    public static void main(String[] args) {
        planVacation();
    }

    public static void planVacation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter one of the two vacation types - 1 for beach or 2 for mountain:");
        int vacationType = scanner.nextInt();
        System.out.println("Please enter budget per day and per person :");
        int budgetPerDayPerPerson = scanner.nextInt();

        switch (vacationType) {
            case 1:
                if (budgetPerDayPerPerson <50) {
                    System.out.println("Visit Bulgarian's beach");
                } else {
                    System.out.println("Visit a beach outside Bulgaria");
                }
                break;
            case 2:
                if (budgetPerDayPerPerson <30) {
                    System.out.println("Visit Bulgarian's mountains");
                } else {
                    System.out.println("Visit a mountain outside Bulgaria");
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation");
        }
    }

}
