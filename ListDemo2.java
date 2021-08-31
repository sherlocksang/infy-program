package com.infosys.day4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


class Student {
	String name;
	int RollNo;
	int Marks;
	int height;
	
	
	public Student(String name, int rollNo, int marks, int height) {
		super();
		this.name = name;
		RollNo = rollNo;
		Marks = marks;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "student [name=" + name + ", RollNo=" + RollNo + ", Marks=" + Marks + ", height=" + height + "]";
	}
	
}

class customSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		int nm  = o1.getName().compareTo(o2.getName());
		int gm  = o1.getMarks()-(o2.getMarks());
		int gr  = o1.getRollNo()-(o2.getRollNo());
		int gh  = o1.getHeight()-(o2.getHeight());
		if(nm != 0)return nm;
		if(gm != 0 )return gm;
		if(gr != 0) return gr;
		
		return gh;
	
	}
	
}


public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student stu = new Student();
		
		List<Student> lst = new ArrayList<>();
		List<Student> lst2 = new LinkedList<>();
		
		
//		System.out.println("enter No : ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i= 0;i<n;i++) {
//			
//		}
		
		lst.add(new Student("rami" , 1 , 70 , 6));
		lst.add(new Student("sam" , 2 , 80 , 7));
		lst.add(new Student("yam" , 3 , 70 , 6));
		lst.add(new Student("zami" , 1 , 70 , 6));
		lst.add(new Student("raj" , 1 , 70 , 6));
		lst.add(new Student("aam" , 2 , 80 , 7));
		lst.add(new Student("bba" , 3 , 70 , 6));
		lst.add(new Student("aam" , 1 , 70 , 6));
		
		
		
		Collections.sort(lst , new customSort());
		
		for(Student st : lst) {
			System.out.println(st);
		}
		
		
		
		
		lst2.add(new Student("rami" , 1 , 70 , 6));
		lst2.add(new Student("sam" , 2 , 80 , 7));
		lst2.add(new Student("yam" , 3 , 70 , 6));
		lst2.add(new Student("zami" , 1 , 70 , 6));
		lst2.add(new Student("raj" , 1 , 70 , 6));
		lst2.add(new Student("aam" , 2 , 80 , 7));
		lst2.add(new Student("bba" , 3 , 70 , 6));
		lst2.add(new Student("aam" , 1 , 70 , 6));
		
		
		Iterator<Student> it = lst2.iterator();
		while(it.hasNext()) {
			Student val = it.next();
			System.out.println(val.getName());
		}
	}

}
