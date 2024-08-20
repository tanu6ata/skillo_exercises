package skillo.lection6;

public class PredefinedMatrix {
    public static void main(String[] args) {
        printPredefinedMatrix();
    }

    public static void printPredefinedMatrix() {
        //Print elements of a given 2-d matrix with 4 rows and 3 columns

        int[][] matrix = {
                {1, 2, 3},
                {10, 20, 30},
                {15, 25, 35},
                {21, 31, 41}
        };

        for (int row = 0; row < matrix.length; row++)
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col]);
            }
    }
}
