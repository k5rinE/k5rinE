package ex01;

public class Opex01 {

	public static void main(String[] args) {
		
		char c = 'a';
		for (int i = 0; i < 26; i++) {   // for 반복문
		System.out.print(c++);   
		}
	
		System.out.println();
		
		c = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		
		System.out.println();     //줄바꿈을한다
		
		c = '0';
		for (int i = 0; i < 10; i++) {
			System.out.print(c++);
		}
		System.out.println();	
		
}
}	