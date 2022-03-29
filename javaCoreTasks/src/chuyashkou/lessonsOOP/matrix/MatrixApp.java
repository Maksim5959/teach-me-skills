package chuyashkou.lessonsOOP.matrix;

public class MatrixApp {

    public static void main(String[] args) {

        Matrix matrix1 = new Matrix(2,20 );
        Matrix matrix2 = new Matrix(new int[][]{{1, 2, 3}, {1, 4, 6}, {1, 8, 7}});

        matrix1.printMatrix();
        System.out.println();
        matrix2.printMatrix();
        System.out.println();

    }
}
