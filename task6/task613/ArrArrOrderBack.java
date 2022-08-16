package com.epamjavaweb.task6.task613;
/*

Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1   2   3   ...  n
n   n-1 n-2      1
1   2   3   ...  n
.   .   .   ...  .
.   .   .   ...  .
.   .   .   ...  .
n   n-1 n-2      1

 */

public class ArrArrOrderBack {

    public static void main(String[] args) {
        int n = 8;
        int[][] arrArr = new int[n][n];

        System.out.println("The final matrix");
        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0; j < arrArr[i].length; j++) {
                if (i == 0 | i % 2 == 0) {
                    arrArr[i][j] = j + 1;
                } else {
                    arrArr[i][j] = arrArr.length - j;
                }
                System.out.printf("[%4d] ", arrArr[i][j]);
            }
            System.out.println();
        }
    }
}
