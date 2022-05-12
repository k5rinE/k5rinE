package ex;

import java.util.Iterator;
import java.util.TreeSet;



	class Person{
	String name;
	int age;
	
	}
	
public Person(String name, int age) {
	this.name = name;
	this.age= age;
}
	
@Override
	public String toString() {
		return name + " : " +age;
	}
	
	
	
public class TreeSetEx2 {
	
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(new Person("kim",20))
		tree.add(new Person("park",50));
		tree.add(new Person("lee,"80));
		tree.add(new Person("lee",80));
		tree.add(new Person("kim,29));
		tree.add(new Person("kim,80));

		
		for(Integer n : tree)
			System.out.println(n.toString()+ "\t");
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		Iterator<Integer> itr = tree.iterator();
		while(itr.hasNext()) {
			Integer n = itr.next();
			System.out.println(itr.next().toString()+ "\t");
		}
	}


