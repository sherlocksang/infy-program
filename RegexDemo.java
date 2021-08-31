package com.infosys.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public static  boolean isMobileNumberValid(String s) {
		//Pattern pt = Pattern.compile("[0-9]{3}\\-[0-9]{3}\\-[0-9]{3}");
		
		Pattern pt  = Pattern.compile("\\d\\-\\d\\-\\d");
		
		Matcher m = pt.matcher(s);
		
		return m.matches();
		
	}
	
	public  boolean isEmailValid(String s) {
		Pattern pt = Pattern.compile("[a-zA-Z0-9_\\-\\.]+[@][a-z]+[.][a-z]{2,3}");
		
		Matcher m = pt.matcher(s);
		
		return m.matches();
				
	}
	public static  boolean isMobileNumberValid2(String s) {
		if(s.matches("[0-9]{3}\\-[0-9]{3}\\-[0-9]{3}"))return true;
		return false;
		
	}
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Phone Number : ");
		
		String s = sc.next();
		if(isMobileNumberValid(s) == true) {
			System.out.println("True");
		}
		else {
			System.out.println("use yourself you dope head ");
		}
		System.out.println("Enter Email address : ");
		String s1 = sc.next();
		
		RegexDemo rd = new RegexDemo();
		if(rd.isEmailValid(s1) == true) {
			System.out.println("True");
		}
		else {
			System.out.println("use yourself you dope head ");
		}
	}
}
