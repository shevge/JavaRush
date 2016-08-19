package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args)   throws Exception {

        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        while(true) {
            int i = scanner.nextInt();
            sum = sum + i;
            if(i == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}
