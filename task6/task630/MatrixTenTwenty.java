package com.epamjavaweb.task6.task630;
/*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MatrixTenTwenty {
    public static void main(String[] args) {

        Random matrix = new Random();
        List<Integer> listFive = new ArrayList<>();
        int countFive = 0;
        int[][] arrArr = new int[10][20];
        System.out.println("The initial matrix");
        for (int i = 0; i < arrArr.length; i++) {
            for (int j = 0; j < arrArr[i].length; j++) {
                arrArr[i][j] = matrix.nextInt(0, 16);
                System.out.printf("[%3d] ", arrArr[i][j]);
                if (arrArr[i][j] == 5) {
                    countFive++;
                }
            }
            if (countFive > 3) {
                listFive.add(i);
            }
            System.out.println();
            countFive = 0;
        }
        System.out.println();
        if (listFive.size() != 0) {
            System.out.println("These lines are on the console");
            for (int iList : listFive) {
                System.out.printf("[%3d] ", iList);
            }
        } else {
            System.out.println("There are no such lines.");
        }

    }
}
