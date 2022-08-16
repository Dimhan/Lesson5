package com.epamjavaweb.task6.task623;

//Сформировать квадратную матрицу порядка N по правилу: A[i,j] = sin((i*i - j*j)/N)
//и подсчитать количество положительных элементов в ней.


public class MatrixSin {
    public static void main(String[] args) {
        int n = 10;
        double[][] arrArr = new double[n][n];
        int countPosEl = 0;

        System.out.println("The final matrix");
        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0; j < arrArr.length; j++) {
                arrArr[i][j] = Math.sin(((double) (i * i - j * j)) / n);
                if (arrArr[i][j] > 0) {
                    countPosEl++;
                }
                System.out.printf("[%6.3f] ", arrArr[i][j]);
            }
            System.out.println();
        }
        System.out.println("The number of positive elements is equal  " + countPosEl);
    }
}
