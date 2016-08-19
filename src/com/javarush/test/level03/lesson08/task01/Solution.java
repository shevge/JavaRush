package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        String sumAge = scanner.nextLine();
        String name = scanner.nextLine();
        int nAge = Integer.parseInt(sumAge);
        System.out.println(name + " захватит мир через " + sumAge +" лет. Му-ха-ха!");
    }
}