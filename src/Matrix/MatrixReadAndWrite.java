package Matrix;

import java.util.Scanner;

public class MatrixReadAndWrite {

    Scanner scanner = new Scanner(System.in);

    int[][] readMatrixWithDifferentSize() {

        System.out.println("Enter the size of the row: ");
        int row = scanner.nextInt();

        System.out.println("Enter the size of the column: ");
        int column = scanner.nextInt();

        return matrixInput(row, column);
    }

    int[][] readMatrixWithSameSize() {

        System.out.println("Enter the size of 2D matrix (same number of rows and columns): ");

        int rowsAndColumns = scanner.nextInt();

        return matrixInput(rowsAndColumns, rowsAndColumns);
    }

    private int[][] matrixInput(int row, int column) {

        int[][] matrix = new int[row][column];

        System.out.println("Enter the elements of the matrix: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }
}
