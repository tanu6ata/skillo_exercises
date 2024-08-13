package skillo.lection4;



import java.util.Scanner;

public class ConvertingTemperature {
    public static void main(String[] args) {
        convertTemperature();
    }

    public static void convertTemperature() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature: ");
        double temp = scanner.nextDouble();
        System.out.println("Select temperature scale between F or C: "); // F or C
        String tempScale = scanner.next();

        switch (tempScale) {
            case "F":
                double celsius = (temp - 32) / 1.8;
                System.out.println("The temperature in C is: " + celsius + "°C");
                break;
            case "C":
                double fahrenheit = (temp * 1.8) + 32;
                System.out.println("The temperature in F is: " + fahrenheit + "°F");
                break;
            default:
                System.out.println("Error");
        }
    }
}