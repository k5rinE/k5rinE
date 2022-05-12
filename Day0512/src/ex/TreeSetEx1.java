package ex;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx1 {


	
	
	
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		
		for(Integer n : tree)
			System.out.println(n.toString()+ "\t");
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		Iterator<Integer> itr = tree.iterator();
		while(itr.hasNext()) {
			Integer n = itr.next();
			System.out.println(itr.next().toString()+ "\t");
		}
	}

}
