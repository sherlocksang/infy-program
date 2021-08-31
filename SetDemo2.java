package com.infosys.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class employee{
	private int x ;
	String s;
	public employee(int x, String s) {
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
		employee other = (employee)obj;
		if (this.x == other.x) return true;
		else return false;
	}
	
	
	
}

class Sortbyfirst implements Comparator<employee1>{
	@Override
	public int compare(employee1 a , employee1 b) {
		
		
		return a.getX() - b.getX();
	}

	
}

class SortbySecond implements Comparator<employee1>{
	@Override
	public int compare(employee1 a , employee1 b) {
		return a.getS().compareTo(b.getS());
	}

	
}
public class SetDemo2 {

	public static void main(String[] args) {
		
		Set<employee> mset = new 
		
	}

}
