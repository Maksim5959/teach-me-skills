package com.chuyashkou.lessons_oop.matrix;

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
        this.values = new int[rows][columns];
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
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + values[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            System.out.println("Суммирование матриц невозможно.");
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

    public void multiplyMatrix(int[][] matrix) {
        if (values[0].length == matrix.length) {
            int[][] results = new int[values.length][matrix[0].length];
            for (int i = 0; i < values.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    for (int k = 0; k < matrix.length; k++) {
                        results[i][j] += values[i][k] * matrix[k][j];
                    }
                }
            }

            for (int[] result : results) {
                for (int a : result) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Умножение матриц невозможно.");
        }
    }
}
