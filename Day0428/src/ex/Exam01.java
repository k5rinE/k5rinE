package ex;

public class Exam01 {

	public static void main(String[] args) {
		animal an = new animal();
		animal an2 = new Mammal();
		animal an3 = new Person();
		
		an.eat();
		an2.eat();
		an3.eat();
		an3.eat();
		
		Mammal ma = new Person();
		ma.eat();     //이건 가능 포유류가 사람을 포함하기때문
		
		animal animal = new Person();
		
		if(animal instanceof Birds) {
			Birds birds = (Birds)animal;
		}
		else if(animal instanceof Mammal)  {     
			Mammal mammal = (Mammal)animal;
		}
					
		// Whale wh = new Person();
		 //	wh.eat();
		//Object obj = new Person();
	//		obj.eat(); 	// 되나 안대나 이유는?  //obj는 최상위 클래스이고 접근은 가능하나 eat에 대한 내용이 없어서 불가
	}

}

class animal{
	void eat() {
		System.out.println(" 동물이 먹는다");
	}
}
class Mammal extends animal{
	void eat() {
		System.out.println(" 포유류 먹는다");
	}
}
class Whale extends Mammal{
	void eat() {
		System.out.println(" 고래가 먹는다");
}
	
}
class Person extends Mammal{
	void eat() {
		System.out.println(" 사람이 먹는다");
}
	
}
class Birds extends animal{
	void eat() {
		System.out.println(" 새가 먹는다");
}
	
}
class Penguin extends Birds{
	void eat() {
		System.out.println(" 팽귄이 먹는다");
}
	
}
class Parrow extends Birds{
	void eat() {
		System.out.println(" 참새가 먹는다");
}
	
}
