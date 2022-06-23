package com.max.idea;

import java.util.Scanner;
import java.util.Arrays;

public class FinalTask3 {
    public static void main(String[] args) {
        //Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
        // Среди данных строк найти строку с максимальным количеством различных символов.
        // Если таких строк будет много, то вывести первую.
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int quantity = in.nextInt();
        String lines[] = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            lines[i] = in.next();
        }

        long result[] = new long[quantity];
        int answer = 0;

        for (int i = 0; i < lines.length; i++) {
            result[i] = lines[i].chars().distinct().count();
        }

        long max = result[0];
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max)
                answer = i;
        }

        System.out.println("Ответ: " + lines[answer]);

    }
}



