package com.epamjavaweb.task6.task627;
/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на
соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */

import java.util.Random;
import java.util.Scanner;

public class Movement {
    public static void main(String[] args) {
        int n = 10;
        int[][] arrArr = new int[n][n];
        int j1 = 0;
        int j2 = j1;
        Random randomIJ = new Random();

        Scanner column = new Scanner(System.in);
        while (j1 == j2 | j1 >= n | j2 >= n) {
            System.out.print("Enter number first column:");
            while (!column.hasNextInt()) {
                column.nextLine();
                System.out.println("It is no number");
            }
            j1 = column.nextInt();
            System.out.print("Enter number second column:");
            while (!column.hasNextInt()) {
                column.nextLine();
                System.out.println("It is no number");
            }
            j2 = column.nextInt();
            if (j1 == j2 | j1 >= n | j2 >= n) {
                System.out.println("These numbers are incorrect, try again");
            }
        }
        System.out.println("The initial matrix");
        for (int mi = 0; mi < arrArr.length; mi++) {
            for (int mj = 0; mj < arrArr[mi].length; mj++) {
                arrArr[mi][mj] = randomIJ.nextInt(100);
                System.out.printf("[%4d] ", arrArr[mi][mj]);
            }
            System.out.println();
        }

        int[] arrMove = new int[n];
        for (int i = 0; i < arrArr.length; i++) {
            arrMove[i] = arrArr[i][j1];
            arrArr[i][j1] = arrArr[i][j2];
            arrArr[i][j2] = arrMove[i];
        }
        System.out.println("The final matrix");
        for (int[] moveI : arrArr) {
            for (int moveJ : moveI) {
                System.out.printf("[%4d] ", moveJ);
            }
            System.out.println();
        }
    }
}
