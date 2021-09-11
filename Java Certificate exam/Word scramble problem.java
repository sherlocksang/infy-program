package com.infosys.certificationTest1;

import java.util.Arrays;

public class Test1Problem1 {
		public static void main(String[] args) {
			String str = "I am qwerty abcdef";
			String[] s = str.split("\\s");
			//System.out.println(s.length);
			for(int i =0 ;i<s.length;i++) {
				StringBuilder sb = new StringBuilder(s[i]);
				int n = sb.length();
				if(n > 2) {
					String substr = sb.substring(1, n-1);
					char[] c = substr.toCharArray();
					Arrays.sort(c);
					String substr2 = new String(c);
					StringBuilder input1 = new StringBuilder(substr2);
					if((i+1)%2 != 0) {
						input1.reverse();
					}
					
					if(i == 0) {
						System.out.print(Character.toString(sb.charAt(0))+input1+Character.toString(sb.charAt(n-1)));
					}
					else {
						System.out.print(" "+Character.toString(sb.charAt(0))+input1+Character.toString(sb.charAt(n-1)));
					}
					
				}
				else {
					if(i == 0)System.out.print(s[i]);
					else System.out.print(" "+s[i]);
				}
			}
		}
}
