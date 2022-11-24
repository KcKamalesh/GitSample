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

		int a=10,b=15;
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(b/a);

	}
}
