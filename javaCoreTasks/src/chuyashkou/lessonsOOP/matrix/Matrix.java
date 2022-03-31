package chuyashkou.lessonsOOP.matrix;

import java.util.Random;

public class Matrix {

    private int [][] values;
    private int rows;
    private int columns;

    public Matrix() {
    }

    public Matrix(int[][] values) {
        this.values = values;
    }

    public Matrix(int rows, int columns) {
        Random random = new Random();
        this.values = new int[columns][rows];
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

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public void printMatrix() {
        for (int[] values : this.values) {
            for (int value : values) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void sumMatrix(int[][] matrix) {
        if (matrix.length == this.values.length && matrix[0].length == this.values[0].length) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + values[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("Суммирование не возможно.");
        }
    }

    public void multiply(int value) {
        for (int[] ints : this.values) {
            for (int j = 0; j < this.values[0].length; j++) {
                System.out.print(ints[j] * value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
