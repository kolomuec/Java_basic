package com.max.idea;

public class Massiv {
    public static void main(String[] args) {
        //1. Задайте массив из 5 любых целых чисел
        int[] array = {6, 7, 3, 9, 10};

        //2. Поменяйте местами первый и последний элемент в массиве
        int i = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = i;

        //3. Вывести в консоль результат суммы первого и среднего элемента
        System.out.println("Сумма первого и среднего элемента: " + (array[0] + array[array.length/2]));
    }
}
