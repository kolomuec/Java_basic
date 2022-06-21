package com.max.idea;

import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
        // Пользователь вводит текущий курс и количество рублей.
        System.out.print("Введите курс доллара: ");
        double rate = in.nextDouble();

        System.out.print("Введите сумму в рублях: ");
        int rub = in.nextInt();

        // Итоговое значение должно быть округлено до двух знаков после запятой.
        double value = rub/rate;
        String result = String.format("%.2f",value);
        System.out.printf("Итого: " + result + " долларов");
    }
}
