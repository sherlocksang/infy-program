package com.infosys.day4;
public class TestingCode {
	public static void display() {
		System.out.println("Inside Display");
		throw new ArithmeticException();
	}
	public static void main(String[] args) throws Exception {
		display();
		System.out.println("Inside Main");
	}
}