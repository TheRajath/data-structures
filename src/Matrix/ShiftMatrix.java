package Matrix;

import java.util.Scanner;

import static java.lang.System.exit;

public class ShiftMatrix {

    /*Given a square matrix mat[][] and a number k. The task is to shift the first k elements of each row to
    the right of the matrix.*/

    private void shiftKElements(int[][] matrix, int k) {

        int n = matrix.length;

        if (k > n) {

            System.out.println("Shifting is not possible");
            exit(0);
        }

        int j = 0;

        while (j < n) {

            for (int i = k; i < n; i++) {

                System.out.print(matrix[j][i] + " ");
            }

            for (int i = 0; i < k; i++) {

                System.out.print(matrix[j][i] + " ");
            }

            System.out.println();
            j++;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MatrixReadAndWrite matrixReadAndWrite = new MatrixReadAndWrite();

        int[][] matrix = matrixReadAndWrite.readMatrixWithSameSize();

        System.out.println("Enter k (shift first k elements to right of the row): ");
        int k = scanner.nextInt();

        new ShiftMatrix().shiftKElements(matrix, k);
    }

}
