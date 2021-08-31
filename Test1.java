package com.infosys.day4;


 class Test1 {

	public static void main(String[] args) {
		
		try {
			int a = 1;
			@SuppressWarnings("unused")
			int b = 3/a;
			Demo f = new Demo();
			f.run();
			System.out.println("we have reched here");
		}
		catch(ArithmeticException e) {
			System.out.println("exception detail " + e.getMessage());
			e.printStackTrace();
			//System.out.println("Exception stack " + e.printStackTrace());
		}
		finally {
			System.out.println("finally block");
		}
		//System.out.println("we have reached here");
	}

}
