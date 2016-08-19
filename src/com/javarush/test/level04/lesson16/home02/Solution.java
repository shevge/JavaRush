package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a > b && a > c && b > c)
            System.out.println(b);
        if (a > b && a > c && b < c)
            System.out.println(c);
        if (b > a && b > c && a > c)
            System.out.println(a);
        if (b > a && b > c && a < c)
            System.out.println(c);
        if (c > a && c > b && b < c)
            System.out.println(c);
        if (c > a && c > b && b > c)
            System.out.println(b);
    }
}
