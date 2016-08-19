package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Имена идентичны");
        } else {
            if (a.length() == b.length())
                System.out.println("Длины имен равны");
        }
    }

        //int name = a.length();
        //int name1 = b.length();
        //if (name == name1)
            //System.out.println("Имена идентичны");
        //if (name != name1 && a.length() == b.length())
            //System.out.println("Длины имен равны");

}
