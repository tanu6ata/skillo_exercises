package skillo.lection4;

public class EligibleToWork {
    public static void main(String[] args) {
        checkWorkEligibility();
    }

    public static void checkWorkEligibility() {
        int age = 17;
        if (age >= 16) {
            System.out.println("The person is elibible to work");
        } else {
            System.out.println("The person is not elibible to work");
        }
    }
}
