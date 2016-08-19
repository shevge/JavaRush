package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число элементов массива: ");
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("введите элемент массива " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.print("Максимальное число массива: " + max);
    }

    /*
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        if (a >= a1 && a >= a2 && a >= a3)
            System.out.println(a);
        if (a1 >= a && a1 >= a2 && a1 >= a3)
            System.out.println(a1);
        if (a2 >= a && a2 >= a1 && a2 >= a3)
            System.out.println(a2);
        if (a3 >= a && a3 >= a1 && a3 >= a2)
            System.out.println(a3);
    }
    */
}
