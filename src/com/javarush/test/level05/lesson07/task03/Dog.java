package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {
    private String name = null;
    public void initialize(String name) {
        this.name = name;
    }

    private int growth = 0;
    public void initialize(String name, int growth) {
        this.name = name;
        this.growth = growth;
    }

    private String color = null;
    public void initialize(String name, int growth, String color) {
        this.name = name;
        this.growth = growth;
        this.color = color;
    }
}
