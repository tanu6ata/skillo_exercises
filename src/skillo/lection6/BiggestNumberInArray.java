package skillo.lection6;

public class BiggestNumberInArray {
    public static void main(String[] args) {
        printBiggestNumber();
    }

    public static void printBiggestNumber() {
        // Find biggest element of an array and print it in the console

        int[] array = {9, 14, 27, 108, 204, 305, 1023, 2024};

        int biggestNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (biggestNumber < array[i]) {
                biggestNumber = array[i];
            }
        }
        System.out.println("The biggest number in given array is: " + biggestNumber);
    }
}
