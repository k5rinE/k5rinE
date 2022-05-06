package com.ezen01;

final class Card {          		//상속하지마라 변경도마라
String kind;
int num;

Card(){
	this("SPADE", 1);
}
Card(String kind, int num) {
	this.kind = kind;
	this.num = num;
}
@Override
public String toString() {      //없으면 주소값만 나옴  오버라이딩하면 내용이나옴
	return kind + ":" +num;
	
}
}

class ClassEx1 {
	public static void main(String[] args) throws Exception {
		Card c = new Card("HEART",3);
		Card c2 = Card.class.newInstance();      //가급적사용하지말라는 내용 deprecated since version 9
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
		
	}
}