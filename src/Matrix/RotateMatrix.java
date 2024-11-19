package Matrix;

public class RotateMatrix {

    /*Given a square matrix mat[][], turn it by 90 degrees in an anticlockwise direction.*/

    private void rotateMatrix90(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            int start = 0;
            int end = n - 1;

            while (start < end) {

                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {

        MatrixReadAndWrite matrixReadAndWrite = new MatrixReadAndWrite();

        int[][] matrix = matrixReadAndWrite.readMatrixWithSameSize();

        new RotateMatrix().rotateMatrix90(matrix);

        matrixReadAndWrite.printMatrix(matrix);
    }
}
