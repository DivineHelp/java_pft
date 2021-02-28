package ru.stqa.pft.sandbox;

public class Square {
    public double l;

//    Создаем и инициализируем т.н. Конструктор. Значение  атрибута создаваемого объекта равно параметру передаваемый в функцию
    public Square(double l) {
        this.l = l;
    }


    public double area() {
        return this.l * this.l;
    }

}
