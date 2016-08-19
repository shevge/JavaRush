package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Scanner;

// todo: переписать с применением оператора цикла (for)
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b && b <= c)
            System.out.print(c + " " + b + " " +a);
        if (a <= c && c <= b)
            System.out.print(b+" "+c+" "+a);
        if (b <= a && a <= c)
            System.out.print(c+" "+a+" "+b);
        if (b <=c && c <= a)
            System.out.print(a+" "+c+" "+b);
        if (c <= a && a <= b)
            System.out.print(b+" "+a+" "+c);
        if (c <= b && b <=a)
            System.out.print(a+" "+b+" "+c);
    }
}
