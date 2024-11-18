package Matrix;

import java.util.Scanner;

public class MatrixSearch {

    boolean searchMatrix(int[][] matrix, int target) {

        /*We can search an element in a matrix by traversing all the elements of the matrix.*/

        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == target) {
                    System.out.println(" Index: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }

        return false;
    }

    boolean searchElementUsingRowAndColumnElimination(int[][] matrix, int target) {

        /*Given an N X N matrix and an integer X, find the position of X in the matrix if it is present.
        Otherwise, print “Element not found”. Every row and column of the matrix is sorted in increasing order.*/

        int n = matrix.length;
        int i = 0, j = n - 1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                System.out.println(" Index: (" + i + ", " + j + ")");
                return true;
            }
            if (matrix[i][j] > target) {
                j--;

            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MatrixSearch matrixSearch = new MatrixSearch();
        MatrixReadAndWrite matrixReadAndWrite = new MatrixReadAndWrite();

        System.out.println("1. Search element randomly");
        System.out.println("2. Search element in a sorted NxN matrix");

        int choice = scanner.nextInt();

        int[][] matrix;
        boolean isElementFound = false;

        if (choice == 1) {

            matrix = matrixReadAndWrite.readMatrixWithDifferentSize();

            System.out.println("Enter the target to be searched: ");
            int target = scanner.nextInt();

            isElementFound = matrixSearch.searchMatrix(matrix, target);

        } else if (choice == 2) {

            matrix = matrixReadAndWrite.readMatrixWithSameSize();

            System.out.println("Enter the target to be searched: ");
            int target = scanner.nextInt();

            isElementFound = matrixSearch.searchElementUsingRowAndColumnElimination(matrix, target);
        }

        if (isElementFound) {

            System.out.println("Element found");

        } else {

            System.out.println("Element not found");
        }
    }
}
