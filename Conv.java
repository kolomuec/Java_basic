package com.max.idea;

import java.util.Scanner;

public class Conv {
    public static void main(String[] args) {

        // 1. Пользователю предлагается на выбор ввести массу или расстояние.

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        switch (x) {
            case 1:
            case 2:
                break;
            default:
                System.out.println("ERROR");
                System.exit(0);
        }

        // 2. Пользователю предлагается выбрать единицу измерения.

        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int y = in.nextInt();
        switch (y) {
            case 1:
            case 2:
            case 3:
            case 4:
                String abs = (x == 2) ? "Введите число" : "Вы ввели единицу измерения, отличную от массы";
                System.out.println(abs);
                break;
            default:
                System.out.println("ERROR");
                System.exit(0);
            break;
        }

    // 3. Пользователю предлагается ввести количество выбранных единиц:
        double z = in.nextDouble();
        System.out.println("Результат: ");
        switch (y) {
            case 1: System.out.println("Метры: " + z);
                System.out.println("Мили: " + (z * 0.0006));
                System.out.println("Ярды: " + (z * 1.094));
                System.out.println("Футы: " + (z * 3.281));
                break;
            case 2: System.out.println("Метры: " + (z * 1609.34));
                System.out.println("Мили: " + z);
                System.out.println("Ярды: " + (z * 1760));
                System.out.println("Футы: " + (z * 5280));
                break;
            case 3: System.out.println("Метры: " + (z * 0.9144));
                System.out.println("Мили: " + (z * 0.00057));
                System.out.println("Ярды: " + z);
                System.out.println("Футы: " + (z * 3));
                break;
            case 4: System.out.println("Метры: " + (z * 0.3048));
                System.out.println("Мили: " + (z * 0.00019));
                System.out.println("Ярды: " + (z * 0.33));
                System.out.println("Футы: " + z);
                break;
            default:
                System.out.println("ERROR");
                System.exit(0);
                break;
        }
     }
}


