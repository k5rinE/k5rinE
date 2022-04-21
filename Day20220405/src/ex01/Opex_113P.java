package ex01;

public class Opex_113P {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String ("abc"); //String11 = "abc"; 이거는 위에꺼랑 그냥 공유
											// new String 은 새로운 주소값에 넣는다
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf("str1==\"abc\" ? %b%n", str1=="abc");
		System.out.printf("str2==\"abc\" ? %b%n", str2=="abc");
		System.out.printf("str1. equals(\"abc\") ? %b%n", str1.equals("abc")); // 주소값이 중요하지않고 주소안에 참조 해당값이 같냐 체크하는명령
		System.out.printf("str2. equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2. equals(\"ABC\") ? %b%n", str2.equals("ABC")); 
		System.out.printf("str2. equalsIgnoreCase(\"ABC\")? %b%n", str2.equals("ABC")); 
	}

}
