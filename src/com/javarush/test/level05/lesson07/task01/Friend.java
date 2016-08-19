package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend {
    private String name = null;

    public void initialize(String name) {
        this.name = name;
    }

    private int age = 0;

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String gender = null;

    public void initialize(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = null;
    }
}
