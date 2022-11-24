package org.sam;

public class Sample {

	private void add() {
		System.out.println("Addition");
	}

	private void sub() {
		System.out.println("Subtraction");

	}

	private void mul() {
		System.out.println("Multiplication");
	}

	private void div() {
		System.out.println("Divition");

	}

	public static void main(String[] args) {

		Sample sa = new Sample();
		int a = 10, b = 15;
		sa.add();
		System.out.println(a + b);
		sa.sub();
		System.out.println(b - a);
		sa.mul();
		System.out.println(a * b);
		sa.div();
		System.out.println(b / a);

	}
}
