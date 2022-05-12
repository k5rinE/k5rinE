import java.util.*;
public class HashSetEx1 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");							//set 으로 중복이 안댐
		set.add(new Person("David",10));
		set.add(new Person("David",10));		// new Person으로 
													//생성한 생성자 호출해서 중복간,ㅇCar
		
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	public String toString() {
		return name + ":"+ age;
	}
	
}