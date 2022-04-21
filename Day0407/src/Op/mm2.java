package Op;

public class mm2 {

	public static void main(String[] args) {
		
		char ch ='A'; // 대문자 경우에만 소문자로 바꾼다 'A' 65 'a'97 32차이
		
		char lowerCase = ('A'<=ch&&ch<='Z')?(char)(ch+32):ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		//삼항연산자 ? 기준 뒤에 값  ?앞조건
		
		
	int x=5;
	System.out.println(10<x&&x<20);
	
	char ch2='K';
	System.out.println(" "||ch2 == '\t');
	
	char ch3 ='x'
	System.out.println(ch = 'x' || ch == 'X');
	
	char ch4='5';
	System.out.println(ch4(ch4 >= '0') && (ch <= '9'));
	
	
	}

} //https://sjsj1996.tistory.com/8
//https://coderbear.tistory.com/m/43?category=925590