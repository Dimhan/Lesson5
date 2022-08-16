package com.epamjavaweb.task6.task619;
/*

Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1 1 1 1 1 1
    0 1 1 1 1 0
    0 0 1 1 0 0
    0 0 1 1 0 0
    0 1 1 1 1 0
    1 1 1 1 1 1

 */

public class MatrixTrigonOne {
    public static void main(String[] args) {
        int n = 10;
        int[][] arrArr = new int[n][n];

        System.out.println("The final matrix");
        for (int i = 0; i < arrArr.length; i++) {
            if (i < arrArr.length / 2) {
                for (int j = i; j < arrArr[i].length - i; j++) {
                    arrArr[i][j] = 1;
                }
                System.out.println();
            } else {
                for (int ji = arrArr.length - i - 1; ji < i + 1; ji++) {
                    arrArr[i][ji] = 1;
                }
            }
        }
        for (int[] mi : arrArr) {
            for (int mJ : mi) {
                System.out.printf("[%4d] ", mJ);
            }
            System.out.println();
        }
    }
}
