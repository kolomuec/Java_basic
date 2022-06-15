package com.max.idea;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Пользователь вводит любое целое положительное число n.
        System.out.println("Введите любое целое положительное число");
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = i;
        }

        // Программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            if (!(array[i] % 2 == 0)) total += (array[i]);
        }
        System.out.println("Сумма нечетных чисел до введенного числа: " + total);
    }
}
