package com.infosys.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class employee2{
	private int x ;
	String s;
	public employee2(int x, String s) {
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
		employee2 other = (employee2)obj;
		if (this.x == other.x) return true;
		else return false;
	}
	
	
	
}

class Sortbyfirst2 implements Comparator<employee2>{
	@Override
	public int compare(employee2 a , employee2 b) {
		
		
		return a.getX() - b.getX();
	}

	
}

class SortbySecond2 implements Comparator<employee2>{
	@Override
	public int compare(employee2 a , employee2 b) {
		return a.getS().compareTo(b.getS());
	}

	
}
public class SetDemo2 {

	public static void main(String[] args) {
		
		Set<employee2> mset = new LinkedHashSet<employee2>();
		
		mset.add(new employee2(5,"hello"));
		mset.add(new employee2(2,"ghj"));
		mset.add(new employee2(1,"ttyu"));
		mset.add(new employee2(4,"y"));
		
		List<employee2> mylist = new ArrayList<>(mset);
		
		Collections.sort(mylist , (o1,o2)->o1.getS().compareTo(o2.getS()));
		
		for(employee2 val : mylist) {
			System.out.println(val);
		}
	
		
	/*	
	Iterator<employee2> itr = mset.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr);
		}
		
	*/

}

}
