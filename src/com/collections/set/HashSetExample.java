package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>();
        s.add(23);
        s.add(3);
        s.add(13);
        s.add(43);
        s.add(63);
		//System.out.println(s);
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
