package com.Collections.java.pratice;

import java.util.HashSet;
import java.util.Iterator;

class HashSet1
{ 
public static void main(String[] args)
{

HashSet<String> h = new HashSet<String>();
h.add("A");
h.add("B");
h.add("C");
h.add("D");
h.add("D");
//creation of Iterator Object
Iterator<String> itr = h.iterator();
while (itr.hasNext())
{ String str = itr.next();
System.out.println(str);

}
}
}