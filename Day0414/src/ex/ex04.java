package ex;
import java.util.*;
public class ex04 {

	public static void main(String[] args) {

		char lowerCase = 'a';
		char upperCase = (char)(lowerCase -32);
		
		System.out.println(upperCase);
		
	char lo = 'a'; 	//97
	char up = 'A';	//65
	
	System.out.println((char)(lo-32));
	System.out.println((char)(up+32));
	
	float pi = 3.141592f;  //--> 3142
	
	float shortPi=(int)(pi*1000);
	System.out.println(shortPi);
	
	Scanner sc = new Scanner(System.in);
	
	String s3 = new String("java");
	String s4 = sc.nextLine();  //->화면에 글자 넣늘꺼야 말하는칸
	
	System.out.println(s3==s4);  // -> false
	System.out.println(s3.equals(s4)); // -> true
	
	int x = 70;
	
	char result1 = x >= 90 ? 'A' : (x>=80? 'B' : x>=70? 'C' : 'F');
	System.out.println(result1);
	// \-> 보기힘드니
	
		if(x>=90)
		result2 = "A";
			else if (x>=80)
				result2 = 'B';
				else if (x>=70)
					result2 = 'C';         --> 보기편함
	
	System.out.println(result2);
	}

}
