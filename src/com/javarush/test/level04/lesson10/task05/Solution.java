package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        //line - строка
        //column - столбец
        int line = 1;
        int colume = 1;
        while (line <= 10)
        {
            colume = 1;
            while (colume <= 10)
            {
                if (colume == 10)
                    System.out.println(line * colume + " ");
                else
                    System.out.print(line * colume + " ");
                colume++;
            }
            line++;
        }
    }
}
