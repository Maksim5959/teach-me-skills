package chuyashkou.lessonsOOP.matrix;

public class MatrixApp {

    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(4, 4);
        Matrix matrix2 = new Matrix(new int[][]{{1, 2, 3}, {1, 4, 6}, {1, 8, 7}});

        matrix1.printMatrix();

        System.out.println();

        matrix2.printMatrix();

        System.out.println();

        matrix1.sumMatrix(matrix2.getValues());
        matrix1.sumMatrix(new int[][]{{1, 2, 3, 5}, {1, 4, 6, 6}, {1, 8, 7, 7}, {1, 8, 7, 7}});

        System.out.println();

        matrix1.multiply(10);
    }
}
