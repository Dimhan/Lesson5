package com.epamjavaweb.task6.task615;
/*

Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
n   0   0   ...  0
0   n-1 0   ...  0
0   0   n-2 ...  0
.   .   .   ...  .
.   .   .   ...  .
.   .   .   ...  .
0   0   0   ...  1

 */

public class ArrArrNdiagonal {
    public static void main(String[] args) {
        int n = 8;
        int[][] arrArr = new int[n][n];

        System.out.println("The final matrix");
        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0; j < arrArr[i].length; j++) {
                if (i == j) {
                    arrArr[i][j] = arrArr.length - j;
                }
                System.out.printf("[%4d] ", arrArr[i][j]);
            }
            System.out.println();
        }
    }
}
