package com.epamjavaweb.task6.task625;
/*
Получить квадратную матрицу порядка n:
    1       2       3   ...n-1     n
    n+1     n+2     n+3 ...2n-1    2n
    2n+1    2n+2    2n+3...3n-1    3n
      .       .       .     .       .
      .       .        .     .      .
      .       .         .     .     .
   (n-1)n+1 (n-1)n+2 ...   n*n-1   n*n

*/
public class MatrixIncN {
    public static void main(String[] args) {
        int n = 10;
        int[][] arrArr = new int[n][n];

        System.out.println("The final matrix");
        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0; j < arrArr[i].length; j++) {
                arrArr[i][j] = (j + 1) + (n * i);
                System.out.printf("[%5d] ", arrArr[i][j]);
            }
            System.out.println();
        }
    }
}
