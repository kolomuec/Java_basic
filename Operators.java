package com.max.idea;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        // 1. Ввести три числа с клавиатуры x, y, z
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число x: ");
        double x = in.nextDouble();

        System.out.println("Введите число y: ");
        double y = in.nextDouble();

        System.out.println("Введите число z: ");
        double z = in.nextDouble();

        // 2. Найти и вывести в консоль среднее арифметическое этих чисел
        double sraf = (x + y + z) / 3;
        System.out.println("Среднее арифметическое введенных чисел: " + sraf);

        // 3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double sraf2 = sraf / 2;
        double sraf3 = Math.floor(sraf2);

        // 4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        String answer = (sraf3 > 3.0) ? "Программа выполнена корректно" : "ERROR";
        System.out.println(answer);
    }
}
