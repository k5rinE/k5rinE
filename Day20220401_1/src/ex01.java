
public class ex01 {

	public static void main(String[] args) { //위에서 아래로 프로그램이 진행되며, 부분적으로 변수를 바꾸고 싶을떄 이런방법을 선택
		   //System.out.println(x);   변수 위에 출력을 명령하면 안뜸 책24페이지 내용
		int x = 10;
		int y = 20;
		int c = 0;
		
				System.out.println("before x: " + x);
				
 		        System.out.println("before y : " + y); //sysout ctrl+space 자동완성, ""안에는 문자그대로 뒤에는 해당숫자
			
 		        System.out.println("x + y : " + x + y ); //문자 자체를 더함
 		        System.out.println("x + y : " + (x+y) ); //숫자를 계산해서 출력
 		        
 		        c = x;       // 빈그릇 하나만들고(C) 거기에 X담고 Y옮기기 방식
 		        x = y;
 		        y = c;
 		        System.out.println("before x: " + x);
 		        System.out.println("before y : " + y); //sysout ctrl+space 자동완성, ""안에는 문자그대로 뒤에는 해당숫자
			    System.out.println("x + y : " + x + y ); //문자 자체를 더함
		        System.out.println("x + y : " + (x+y) ); //숫자를 계산해서 출력
		        
		      	}
	

}

 