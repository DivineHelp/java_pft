package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
		hello("misha");

		Square s = new Square(5);
//		s.l = 5;
		System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

		Rectangle r = new Rectangle();
		r.a = 3;
		r.b = 4;
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
	}
	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
//Функция подсчета площади квадрата
	public static double area(Square s) {
		return s.l * s.l;
	}

	public static double area(Rectangle r) {
		return r.a * r.b;
	}
}