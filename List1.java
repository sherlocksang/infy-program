package com.infosys.day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		/*
		List<Integer> mylist = new ArrayList<Integer>();
		
		mylist.add(0 ,1);
		mylist.add(1, 2);
		mylist.add(2 , 3);
		
		System.out.println(mylist.size());
		System.out.println(mylist);
		for(Integer x : mylist) {
			System.out.println(x);
		}
		mylist.remove(0);
		for(int i =0 ;i< mylist.size();i++) {
			System.out.println(mylist.get(i));
		}
		
		///////////////////////////
		System.out.println("-------------------");
		List<Integer> mylist1 = new LinkedList<Integer>();
		
		mylist1.add(2);
		mylist1.add(1);
		mylist1.add(3);
		
		Collections.sort(mylist1);
		
		Iterator<Integer> it = mylist1.iterator();
		
		while(it.hasNext()) {
			Integer val = it.next();
			System.out.println(val);
		}
		*/
	

	
	List<String> a = new ArrayList<>();
	
	a.add("hello");
	a.add("add");
	a.add("qwerty");
	
	
	Collections.sort(a);
	}
	
}
