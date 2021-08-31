package com.infosys.day4;

class MyDivException extends Exception{

	public MyDivException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Tester t = new Tester();
		t.divide(0, 0);
	}
	
}

class Tester{
	public void divide(int x,int y) {
		try {
			if(x == 0) {
				throw new MyDivException(" zero ");
			}
		}
		catch(MyDivException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}