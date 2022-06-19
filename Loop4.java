package com.max.idea;

import java.util.Scanner;

public class Loop4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, result;
        // Пользователь задает размерность матрицы
        System.out.print("Введите количество строк: ");
        a = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        b = in.nextInt();
        int[][] array = new int[a][b];

        // Пользователь вводит данные с клавиатуры в матрицу
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Введите элемент в массив в строчку " + i + ", столбец " + j + " ([" + i + "] [" + j + "]): ");
                array[i][j] = in.nextInt();
            }
        }
        in.close();

        // Произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j]*3 + "\t");
            }
         }
    }
}





