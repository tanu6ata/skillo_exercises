package skillo.lection6;

public class SumOfGivenArrayElements {

    public static void main(String[] args) {
        printSumOfGivenArrayElements();
    }

    public static void printSumOfGivenArrayElements() {
        // Write program to print sum of a given array elements

        int[] array = {6, 4, 15, 64, 98, 108, 206};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of all the elements of an array is: " + sum);

    }
}
