package com.chuyashkou.lessons_oop.matrix;

public class MatrixApp {

    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(4, 3);
        Matrix matrix2 = new Matrix(new int[][]{{1, 2, 2}, {1, 1, 0}, {1, 1, 0}, {1, 1, 1}});
        Matrix matrix3 = new Matrix(3, 4);

        matrix1.printMatrix();
        matrix2.printMatrix();
        matrix3.printMatrix();

        matrix1.sumMatrix(matrix2.getValues());
        matrix1.sumMatrix(new int[][]{{1, 2, 3, 5}, {1, 4, 6, 6}, {1, 8, 7, 7}, {1, 8, 7, 7}});

        matrix1.multiply(10);

        matrix1.multiplyMatrix(matrix3.getValues());
    }
}
