package com.max.idea;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        double array[] = new double[size];;

        System.out.println("Введите данные массива. Вам необходимо ввести данное количество цифр: " + size);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        // 2. Посчитайте среднее арифметическое элементов массива.
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            total += (array[i]);
        }
        double average = total / 2;

        // 3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] * average);
            ;
        }
    }
}
