package com.Collections.java.pratice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
	
		
		HashMap<String ,String>h=new HashMap<String,String>();
		
		h.put("CHANDRA", "DEEPAK");
		h.put("CHANDRA1", "DEEPAK1");
		h.put("CHANDRA2", "DEEPAK2");
		h.put("CHANDRA3", "DEEPAK3");
		
		Set s=h.keySet();
		
		System.out.println(s);
		
		Collection c=h.values();
		
		System.out.println(c);
		
		
		Set ss=h.entrySet();
		
		System.out.println("printing all the enteries for a map"+ss);
		
		Iterator itr = ss.iterator();
		while (itr.hasNext())
		{
		//next() method retrun first entry to represent that entery do typeCasting
		Map.Entry m= (Map.Entry)itr.next();
		System.out.println(m.getKey()+"----"+m.getValue()); //printing key and value
		}
		
		
		
		
	for(String x:h.keySet()) {
		
		System.out.println("printing all the values "+h.get(x));
	}
	
	String str="Im learning learning java java java Deepak Deepak Deepak Chandra Chandra Chandra";
	HashMap<String ,Integer>h2=new HashMap<String,Integer>();
	
	Integer count=1;
	
	String [] arr=str.split(" ");
	for(int i=0;i<arr.length;i++) {
		
		if(!h2.containsKey(arr[i])) {
			
			h2.put(arr[i], count);
			
			System.out.println("checking the values"+h2);
		}
		
		else {
			h2.put(arr[i], h2.get(arr[i]+1));
			
		
		
		}
		
		for(String x:h2.keySet()) {
			
			
			System.out.println(x+"---------------------------"+h2.get(x));
		}
	}
	
	

	}

}
