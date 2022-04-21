import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {  //책37페이지
		
		// 이름, 나이 출력 한다.
		
		/*int age = 20;
		String name = "홍길동";
		
		System.out.printf("name : %s, age : %d\n", name, age);
		System.out.println("name : " + name + ", age : " + age);
		*/
		
		int age = 20;   //출력 칸에다가 커서 놓고 내이름 입력하면 출력댐
		String name;
		
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		
		System.out.printf("name : %s, age : %d\n", name, age);
		System.out.println("name : " + name + ", age : " + age);
		
	}

}
