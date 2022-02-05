package com.galinachitakV;

public class lesson11Matrix {

    public static int[][] MATRIX = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    public static void main(String[] args) {
       /* 2*. Написать класс для работы с матрицами (2-мерными массивами), методы:
        print(int[][] matrix) - печатает матрицу
        swapColumns(int[][] matrix, i, j) - меняет 2 столбца местами
        swapRows(int[][] matrix, i, j) - меняет 2 рядка местами
        mul(int[][] matrix, int value) - умножает матрицу на число
        toArray(int[][] matrix) - превращает матрицу в массив. Например если была матрица на 3x4 то
         вернуть массив из 12 элементов
        max(int[][] matrix) - возвращает максимальный элемент матрицы*/


        System.out.println("print");
        print(MATRIX);
        System.out.println();
        System.out.println("swapColumns");
        print(swapColumns(MATRIX, 1, 2));
        System.out.println();
        System.out.println("swapRows");
        print(swapRows(MATRIX, 1, 3));
        System.out.println();
        System.out.println("mul");
        print(mul(MATRIX, 2));
        System.out.println();




    }
    public static int[][] print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }
    public static int[][] swapColumns(int[][] matrix, int x, int y) {
        for (int i = 0; i < matrix.length; i++) {
            int temp = matrix[i][x - 1];
            matrix[i][x - 1] = matrix[i][y - 1];
            matrix[i][y - 1] = temp;
        }

        return matrix;

    }
    public static int[][] swapRows(int[][] matrix, int x, int y) {
        for (int i = 0; i < matrix[0].length; i++) {
            int temp = matrix[x - 1][i];
            matrix[x - 1][i] = matrix[y - 1][i];
            matrix[y - 1][i] = temp;
        }
        return matrix;
    }
    public static int[][] mul(int[][] matrix, int value) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= value;
            }
        }
        return matrix;
    }

}
