package chuyashkou.lessonsOOP.matrix;

import java.util.Random;

public class Matrix {

    private int values[][];

    private int rows;

    private int colums;

    public Matrix() {
    }

    public Matrix(int[][] values) {
        this.values = values;
    }

    public Matrix(int rows, int colums) {
        Random random = new Random();
        this.values = new int[colums][rows];
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                values[i][j] = random.nextInt(10);
            }
        }
    }

    public int[][] getValues() {
        return values;
    }

    public void setValues(int[][] values) {
        this.values = values;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColums() {
        return colums;
    }

    public void setColums(int colums) {
        this.colums = colums;
    }

    public void printMatrix() {
        for (int[] values : this.values) {
            for (int value : values) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }
    }

    public void sumMatrix(int[][] matrix) {
        if (matrix.length == this.values.length && matrix[0].length == this.values[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + values[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Суммирование не возможно.");
        }
    }

    public void multiply(int value) {
        for (int i = 0; i < this.values.length; i++) {
            for (int j = 0; j < this.values[0].length; j++) {
                System.out.print(values[i][j] * value + " ");
            }
            System.out.println();
        }
    }
}
