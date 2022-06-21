package com.max.idea;
import java.util.Random;

public class Data4 {
    public static void main(String[] args) {
        //Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20
        Random RandNum = new Random();
        int maxnum = 0;
        int minnum = 0;

        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = RandNum.nextInt(20 - ((-20))) + (-20);
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

        //1. Выведите максимальный и минимальный элемент массива.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxnum]) {
                maxnum = i;
            }
            else if (array[i] < array[minnum]) {
                minnum = i;
            }
        }
        System.out.println("Максимальный элемент в массиве: " + array[maxnum]);
        System.out.println("Минимальный элемент в массиве: " + array[minnum]);

        //2. Из максимального и минимального значения выведите наибольшее по модулю.
        System.out.println("Наибольшее значение по модулю: " + Math.max(Math.abs(array[maxnum]), Math.abs(array[minnum])));

    }
}
