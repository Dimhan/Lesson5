package com.epamjavaweb.task6.task635;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.Random;

public class MaxAndNotEven {
    public static void main(String[] args) {
        int n = 10;
        int[][] arrArr = new int[n][n];
        Random randomIJ = new Random();
        int matrixMax = 0;

        System.out.println("The initial matrix");
        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0; j < arrArr[i].length; j++) {
                arrArr[i][j] = randomIJ.nextInt(100);
                System.out.printf("[%4d] ", arrArr[i][j]);
                if (arrArr[i][j] > matrixMax) {
                    matrixMax = arrArr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The maximum element of matrix is " + matrixMax);
        System.out.println();
        System.out.println("The final matrix");
        for (int a = 0; a < arrArr.length; a++) {
            for (int b = 0; b < arrArr[a].length; b++) {
                if (arrArr[a][b] % 2 != 0) {
                    arrArr[a][b] = matrixMax;
                }
                System.out.printf("[%4d] ", arrArr[a][b]);
            }
            System.out.println();
        }
    }
}
