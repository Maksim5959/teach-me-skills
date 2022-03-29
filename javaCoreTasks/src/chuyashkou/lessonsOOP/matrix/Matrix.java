package chuyashkou.lessonsOOP.matrix;

import java.util.Random;

public class Matrix {

    private int values [] [];

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
            for (int j = 0; j < values [0].length; j++) {
                values [i] [j] = random.nextInt(10);
            }
        }
    }

    public void printMatrix (){
        for (int [] values:this.values) {
            for (int value:values) {
                System.out.print(value + "  ");
            }
            System.out.println();
        }
    }

    public int[][] getValues() {
        return values;
    }

    public void sumMatrix (int [] [] matrix){
    }


}
