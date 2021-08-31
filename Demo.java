package com.infosys.day4;

public class Demo {
	public int cube(int n) {
		return n * n * n;
	}
	public static void main(String[] args) {
		Demo tc = new Demo();
		try {
		int num = Integer.parseInt(args[0]);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println( e.getMessage());
		}
		finally {
			//System.out.println(tc.cube(num));
		}
	}
	public void run() {
		// TODO Auto-generated method stub
		
	}
}