package com.infosys.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class employee1{
	private int x ;
	String s;
	public employee1(int x, String s) {
		super();
		this.x = x;
		this.s = s;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "employee1 [x=" + x + ", s=" + s + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		result = prime * result + x;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		employee1 other = (employee1)obj;
		if (this.x == other.x) return true;
		else return false;
	}
	
	
	
}

class Sortbyfirst implements Comparator<employee1>{
	@Override
	public int compare(employee1 a , employee1 b) {
		
		int val = a.getS().compareTo(a.getS());
		if(val != 0)return val;
		return a.getX() - b.getX();
	}

	
}

class SortbySecond implements Comparator<employee1>{
	@Override
	public int compare(employee1 a , employee1 b) {
		return a.getS().compareTo(b.getS());
	}

	
}

public class Set1 {

	public static void main(String[] args) {

		Set<employee1>myset = new HashSet<>();
		
		myset.add(new employee1(1 , "rrr"));
		myset.add(new employee1(2 , "bbb"));
		myset.add(new employee1(11 , "xxx"));
		myset.add(new employee1(6 , "ads"));
		myset.add(new employee1(8 , "fg"));
		myset.add(new employee1(3 , "aaa"));
		myset.add(new employee1(1 , "rrr"));
		
		System.out.println(myset.size());
		//if(myset.contains(1))System.out.println("YES");
		 //System.out.println(myset.contains(new employee1(1 , "rrr")));
		
		/*in set we cant sort in order to sort we convert into list then 
		 * collections.sort()  function run
		 */
		
		List<employee1>mylist = new ArrayList<>(myset);
		Collections.sort(mylist , new Sortbyfirst());
		for(employee1 x1 : mylist) {
			System.out.println(x1);
		}
		
		//////////////
		
		Collections.sort(mylist , new SortbySecond());
		for(employee1 x1 : mylist) {
			System.out.println(x1.getS());
		}
	}

}
