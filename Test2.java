package com.infosys.day4;

//class class2{
//	void run(int x , int y) {
//		try {
//			if(x == 0) {
//				throw new Exception("divisor should not zero");
//			}
//			
//			System.out.println(y/x);
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//;		}
//	}
//}

public class Test2 {
	static void run(int x , int y) {
		try {
			if(x == 0) {
				throw new Exception("divisor should not zero");
			}
			
			System.out.println(y/x);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();	
			}
	}

	public static void main(String[] args) {
		
		//class2 c = new class2();
		Test2.run(0 ,1); // here we are able to do this because run is static
		// method so can be called by Test2 class 
		

	}

}
