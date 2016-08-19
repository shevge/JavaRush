package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private  String name = null;

    public Cat(String name) {
        this.name = name;
    }

    private int weight = 0;
    private int age = 0;

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10;
    }

    private String color = null;
    private String adress = null;

    public Cat(int weight, String color, String name, String adress, int age) {
        this.weight = weight;
        this.color = color;
        this.name = null;
        this.adress = null;
        this.age = 0;
    }

    public Cat(int weight, String color, String adress) {
        this.weight = weight;
        this.color = color;
        this.adress = null;
    }
}
