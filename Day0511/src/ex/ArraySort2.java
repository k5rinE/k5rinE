package ex;

import java.util.*;

public class ArraySort2 {

	public static void main(String[] args) {

		Person[] person = new Person[3];

		person[0] = new Person("파카", 25);
		person[1] = new Person("괴물쥐", 30);
		person[2] = new Person("오스트랄로", 22);

		Arrays.sort(person);
		
		for (Person p : person)
			System.out.println(p);

	}
}

class Person implements Comparable {

	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}

//	public int compareTo(Object o) {
//		Person p = (Person) o;
//		return this.age - p.age;   // p.age   <-> age 자리바꾸면 오름차순 내림차순
//		
//		
//	}
	public int compareTo(Object o) {
		Person p = (Person) o;
		return this.name.length() - p.name.length();   // p.age   <-> age 자리바꾸면 오름차순 내림차순
		
		
	}

}
