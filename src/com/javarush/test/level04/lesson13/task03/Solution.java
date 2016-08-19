package com.javarush.test.level04.lesson13.task03;

import java.io.*;

/* Рисуем треугольник
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        for (int i1 = 0; i1 < 10; i1++){
            for (int i2 = 0; i2 < (1 + i1); i2++){
                System.out.print(8);
            }
            System.out.println("");
        }

    }
}
