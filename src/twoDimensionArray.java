public class twoDimensionArray {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    matrix[i][j] = i;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        System.out.println("Matrix:");
        printMatrix(matrix);

        int diagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Sum of elements on the diagonal: " + diagonalSum);
    }

    // Method to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
