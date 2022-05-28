package com.max.idea;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // 1. Ввести 2 числа89 с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        double x = in.nextDouble();
        double y = in.nextDouble();

        System.out.println("Укажите, какую операцию (‘+’, ‘-’, ‘*’ или ‘/’) вы хотите выполнить с числами " + x + " и " + y + ":");
        char op = in.next().charAt(0);

        // 2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        double answer = 0;
        switch (op) {
            case '+': answer = x + y;
                break;
            case '-': answer = x - y;
                break;
            case '*': answer = x * y;
                break;
            case '/': answer = x / y;
                break;
            default:  System.out.println("ERROR");
                return;
        }
        System.out.println("Результат: " + answer);
    }
}
