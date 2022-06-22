package com.max.idea;

import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        //Напишите программу, которая позволит решить простое уравнение относительно x.
        //Программа принимает на вход строку длиной 5 символов.
        //Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
        //Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
        //Нужно найти неизвестное.
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод: ");
        String input = in.nextLine();
        char symbols = input.charAt(1);
        char number1 = input.charAt(0);
        char number2 = input.charAt(2);
        char number3 = input.charAt(4);
        int result = 0;

        if (input.length() > 5) {
            System.out.print("ОШИБКА! Символов слишком много.");
            System.exit(0);
        }

        if (symbols != '+' && symbols != '-') {
            System.out.print("ОШИБКА! Второй символ строки должен быть знаком ‘+’ или ‘-’.");
            System.exit(0);
        }

        if (input.charAt(3) != '=') {
            System.out.print("ОШИБКА! Четверты символ строки должен быть знаком ‘=’");
            System.exit(0);
        }

        if (number1 == 'x') {
            if (symbols == '+') {
                result = Character.getNumericValue(number3) - Character.getNumericValue(number2);
            }
            else {
                result = Character.getNumericValue(number3) + Character.getNumericValue(number2);
            }
        }

        if (number2 == 'x') {
            if (symbols == '+') {
                result = Character.getNumericValue(number1) + Character.getNumericValue(number3);
            }
            else {
                result = Character.getNumericValue(number1) - Character.getNumericValue(number3);
            }
        }

        if (number3 == 'x') {
            if (symbols == '+') {
                result = Character.getNumericValue(number1) + Character.getNumericValue(number2);
            }
            else {
                result = Character.getNumericValue(number1) - Character.getNumericValue(number2);
            }
        }
        System.out.print("Вывод: " + result);
    }
}
