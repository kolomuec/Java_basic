package com.max.idea;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        //Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
        //Ответ: “Заархивированный вирус”.
        //У пользователя есть 3 попытки, чтобы отгадать загадку.
        Scanner in = new Scanner(System.in);
        int result1 = 0;
        System.out.println("Отгадайтие загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        for (int result = 0; result < 3; result++) {
            System.out.println("Ответ: ");
            String answer = in.nextLine();

            if (answer.compareTo("Заархивированный вирус") == 0) {
                System.out.println("Правильно!");
                System.exit(0);
            } else if (answer.compareTo("Подсказка") == 0) {
                    if (answer.compareTo("Подсказка") == 0 && result1 == 0) {
                        System.out.println("Ох уж этот дед формата RAR");
                        result1 = 1;
                    } else {
                        System.out.println("Подсказка уже недоступна");
                    }
                result = -1;
            }
            else {
                System.out.println("Подумай еще!");
            }
        }
        System.out.println("Обидно, приходи в другой раз");
    }
}


