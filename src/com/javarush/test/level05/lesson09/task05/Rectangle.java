package com.javarush.test.level05.lesson09.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота).
Создать для него как можно больше конструкторов:
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle {
    private double left = 0;
    private double top = 0;
    private double width = 0;
    private double height = 0;

    public Rectangle(double left, double top, double width, double height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(double left, double top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(double left, double top, double width)
    {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = 0;
    }

    public Rectangle(Rectangle copy) {
        this.left = copy.left;
        this.top = copy.top;
        this.width = copy.width;
        this.height = copy.width;
    }
}
