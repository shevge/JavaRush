package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Евгений", 48, "Благоева_15_16");
        Man man2 = new Man("Никита", 20, "СПБ_Вяземский переулок_общага");
        Woman women1 = new Woman("Ирина", 42, "Благоева_15_16");
        Woman women2 = new Woman("Анна", 19, "Благоева_15_16");

        System.out.println(man1);
        System.out.println(man2);
        System.out.println(women1);
        System.out.println(women2);
    }

    public static class Man {
        String name = "name";
        int age = 0;
        String address = "address";

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }

    public static class Woman {
        String name = "name";
        int age = 0;
        String address = "address";

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}
