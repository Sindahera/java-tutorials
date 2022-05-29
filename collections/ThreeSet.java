package io.github.sindahera.collections;

import java.util.TreeSet;

public class ThreeSet {

	public static void main(String[] args) {
		 
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		treeSet.add("C");
		
		System.out.println(treeSet);

	}

}
