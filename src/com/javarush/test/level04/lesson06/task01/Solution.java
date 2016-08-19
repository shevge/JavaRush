package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int age1 = scanner.nextInt();

        if (age < age1)
            System.out.println(age);
        else
            System.out.println(age1);
    }
}