package ex01;

public class Opex06 {

	public static void main(String[] args) {
	
		int a = 1; 
		int b = 0;
		int i = 20;
		System.out.println(a>0 && b>0); // 둘다 true 여야 true
		System.out.println(a>0 || b>0); // 둘중하나만 트루면 true
		
		System.out.println(!(a>0 || b>0)); // 
		System.out.println( i%2 ==0 || i%3 == 0 || i%6 !=0); // 3가지 2의배수 3의배수 6의배수 (모순)
		//System.out.println( i%2 ==0 || (i%3 == 0 && i%6 !=0)); // 이런식으로 바꿔야 개소리차단
}
}