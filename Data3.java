package com.max.idea;

import java.util.Scanner;

public class Data3 {
    public static void main(String[] args) {
        //Напишите программу, где пользователь должен ввести строку из слов, разделенных пробелами.
        Scanner in = new Scanner(System.in);
        int count = 0;

        System.out.println("Введите строку из слов, разделенных пробелами.");
        System.out.println("Например: \"I love java 8 Я люблю java 14 core1\": ");
        String str = in.nextLine();

        String[] str2 = str.split(" "); // каждое слово будет проверяться отдельно

        //1. Выведите слова, состоящие только из латиницы.
        System.out.println("Слова, состоящие только из латиницы: ");
        for (int i = 0; i < str2.length; i++) {
            if (str2[i].matches("[a-zA-Z]+") == true) {
                System.out.print(str2[i] + " ");
                count++; // для подсчета слов
            }
        }
        System.out.println();

        //2. Выведите количество этих слов.
        System.out.println("Количество слов на латинице: " + count);
    }
}


