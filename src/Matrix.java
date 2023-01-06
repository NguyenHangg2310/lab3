import java.util.Scanner;

public class Matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[cols2][rows2];
        int[][] matrix11 = createRandomMatrix(2, 3);
        int[][] matrix12 = createRandomMatrix(3, 2);
        createRandomMatrix(matrix2);
        System.out.println(haveSameDimension(matrix1, matrix2));
        printMatrix(add(matrix1, matrix2));
        printMatrix(multiply(matrix11, matrix12));

    }

    public static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] createRandomMatrix(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 30);
            }
        }
        return matrix;
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        if (!(matrix1.length == matrix2.length)) {
            if (!(matrix1[0].length == matrix2[0].length)) {
                return false;
            }
        }
        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if (!(matrix1.length == matrix2.length)) {
            if (!(matrix1[0].length == matrix2[0].length)) {
                return false;
            }
        }
        return true;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] addMatrix = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return addMatrix;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] addMatrix = new double[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
        }
        return addMatrix;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] subtractMatrix = new int[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    subtractMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return subtractMatrix;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] subtractMatrix = new double[matrix1.length][matrix1[0].length];
        if (haveSameDimension(matrix1, matrix2)) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1[0].length; j++) {
                    subtractMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
        }
        return subtractMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] multiplyMatrix = new int[matrix1.length][matrix2[0].length];
        if (matrix1[0].length == matrix2.length) {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    multiplyMatrix[i][j] = 0;
                    for (int k = 0; k < matrix1[0].length; k++) {
                        multiplyMatrix[i][j] = multiplyMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }

        return multiplyMatrix;
    }
}
