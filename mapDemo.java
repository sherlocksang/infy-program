package com.infosys.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class mapDemo {
	 public static void main(String[] args) {
		Map<Integer , String> mp = new HashMap<>();
		mp.put(1 , "asd");
		mp.put(5 , "qq");
		mp.put(4 , "ww");
		mp.put(2 , "aeesd");
		
		for(Integer e : mp.keySet()) {
			System.out.println(e +" "+ mp.get(e));
		}
		
		for(Entry<Integer , String> e : mp.entrySet()) {
			System.out.println(e.getKey() +" "+ e.getValue());
		}
		
		Set<Entry<Integer , String>> st = mp.entrySet();
		
		List<Entry<Integer , String>> lst = new ArrayList<>(st);
		
		Collections.sort(lst, (o1 , o2)->(o1.getValue().compareTo(o2.getValue())));
		for(Entry<Integer , String> val : lst) {
			System.out.println(val.getKey()+" "+val.getValue());
		}
		
		for(Entry<Integer , String> e : mp.entrySet()) {
			System.out.println(e.getKey() +" "+ e.getValue());
		}
	}
}

