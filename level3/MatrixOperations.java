import java.util.Random;

public class MatrixOperations {

    // a. Generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                matrix[i][j] = rand.nextInt(10); // 0 to 9
        return matrix;
    }

    // j. Display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    // b. Add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    // c. Subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    // d. Multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                for(int k=0; k<A[0].length; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }

    // e. Transpose
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];
        for(int i=0; i<rows; i++)
            for(int j=0; j<cols; j++)
                transposed[j][i] = matrix[i][j];
        return transposed;
    }

    // f. Determinant of 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    }

    // g. Determinant of 3x3 matrix
    public static int determinant3x3(int[][] m) {
        int det = m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
        return det;
    }

    // h. Inverse of 2x2 matrix
    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if(det == 0) return null;

        double[][] inverse = new double[2][2];
        inverse[0][0] =  m[1][1] / (double)det;
        inverse[0][1] = -m[0][1] / (double)det;
        inverse[1][0] = -m[1][0] / (double)det;
        inverse[1][1] =  m[0][0] / (double)det;
        return inverse;
    }

    // i. Inverse of 3x3 matrix
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if(det == 0) return null;

        double[][] adj = new double[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                int[][] sub = new int[2][2];
                int row = 0, col;
                for (int r=0; r<3; r++) {
                    if(r == i) continue;
                    col = 0;
                    for (int c=0; c<3; c++) {
                        if(c == j) continue;
                        sub[row][col++] = m[r][c];
                    }
                    row++;
                }
                adj[j][i] = Math.pow(-1, i+j) * determinant2x2(sub); // Transposed cofactors
            }
        }

        // Divide by determinant
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++)
                adj[i][j] /= det;

        return adj;
    }

    // Display a double matrix
    public static void displayDoubleMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    // Main method to test
    public static void main(String[] args) {
        int[][] A = generateMatrix(3, 3);
        int[][] B = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nA + B:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nA - B:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nA * B:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A:");
        System.out.println(determinant3x3(A));

        System.out.println("\nInverse of A:");
        double[][] inverse = inverse3x3(A);
        if(inverse != null)
            displayDoubleMatrix(inverse);
        else
            System.out.println("Inverse does not exist (Det = 0)");
    }
}
