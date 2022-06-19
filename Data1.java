package com.max.idea;

import java.util.Scanner;

public class Data1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1. Ввести первое число с клавиатуры и записать его в строковую переменную.
        System.out.print("Введите первой число: ");
        String str = in.nextLine();

        //2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.print("Введите второе число: ");
        int y = in.nextInt();

        //3. Сравнить 2 числа и вывести большее на экран
        //4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        Integer x = Integer.valueOf(str);

        if (x > y) {
            System.out.println("Большее число: " + x);
            double y1 = y;
            System.out.println("Меньшее число: " + y1);
        }
        else if (x < y) {
            System.out.print("Большее число: " + y);
            double x1 = x;
            System.out.print("Меньшее число: " + x1);
        }
        else {
            System.out.print("Числа равны");
        }
    }
}
