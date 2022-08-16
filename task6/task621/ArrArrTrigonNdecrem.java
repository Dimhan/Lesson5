package com.epamjavaweb.task6.task621;
/*

Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
n   0   0   ...  0
n-1 n   0   ...  0
n-2 n-1 n   ...  0
.   .   .   ...  .
.   .   .   ...  .
2   3   4...n    0
1   2   3   ...  n

 */

public class ArrArrTrigonNdecrem {
    public static void main(String[] args) {
        int n = 10;
        int[][] arrArr = new int[n][n];

        System.out.println("The final matrix");
        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0, j1 = i; j < i + 1; j++, j1--) {
                arrArr[i][j] = arrArr.length - j1;
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
