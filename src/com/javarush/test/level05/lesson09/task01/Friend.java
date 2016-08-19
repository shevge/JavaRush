package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend {
    private String name = null;

    public Friend(String name) {
        this.name = name;
    }
    private int age = 0;
    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private String gender = null;
    public Friend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}