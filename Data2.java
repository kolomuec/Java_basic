package com.max.idea;

import java.util.Scanner;

public class Data2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean result1, result2, result3;

        //Напишите программу, принимающую на вход строку “I like Java!!!”
        System.out.print("Введите \"I like Java!!!\": ");
        String str = in.nextLine();

        //1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        result1 = str.contains("Java");

        //2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        result2 = str.startsWith("I like");

        //3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        result3 = str.endsWith("!!!");

        //4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if (result1 == true && result2 == true && result3 == true) {
            System.out.println(str.toUpperCase());
        }
        else {
            System.out.println("Вы неверно ввели \"I like Java!!!\"");
            System.exit (1);
        }

        //5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        String str1 = str.replace('a', 'o');
        System.out.println(str1.substring(7, 11));
    }
}
