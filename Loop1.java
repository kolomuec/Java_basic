package com.max.idea;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int x = 3;
        final int y = 6;
        final int z = 8;

        //1. Пользователь вводит размер массива и данные с клавиатуры в массив
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        int array[] = new int[size];

        System.out.println("Введите данные массива. Вам необходимо ввести данное количество цифр: " + size);
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        //2. Сравнить элементы массива с заранее заданными константами x, y, z.
        //3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x || array[i] == y || array[i] == z) {
                System.out.println("Данное значение имеется в константах");
            }
        }
    }
}

