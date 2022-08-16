package com.epamjavaweb.task6.task617;
/*

Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
1   1   1   ...  1
1   0   0   ...  1
1   0   0   ...  1
.   .   .   ...  .
.   .   .   ...  .
.   .   .   ...  .
1   1   1   ...  1

 */

public class ArrArrOnePerimetr {
    public static void main(String[] args) {
        int n = 10;
        int[][] arrArr = new int[n][n];

        System.out.println("The final matrix");
        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0; j < arrArr[i].length; j++) {
                if (i == 0 | i == arrArr.length - 1 | j == 0 | j == arrArr[i].length - 1) {
                    arrArr[i][j] = 1;
                }
                System.out.printf("[%4d] ", arrArr[i][j]);
            }
            System.out.println();
        }
    }
}
