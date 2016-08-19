package com.javarush.test.level04.lesson13.task04;

import java.io.*;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i1 = 0; i1 < 9; i1++)
            System.out.print(8);
        for (int i1 = 10; i1 < 21; i1++)
            System.out.println(8);
    }
}
