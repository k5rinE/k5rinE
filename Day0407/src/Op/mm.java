package Op;

public class mm {

	public static void main(String[] args) {
	
		int x =2;
		int y = 5;
		char c = 'A'; //A->65
		
		System.out.println(y >= 5 || (x < 0 && x>2));
		System.out.println(15-x++);
		System.out.println(x+=2);
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c); //순서중요 
		System.out.println(c++);
		System.out.println(c);
		
		int num = 10;  //->넘버값대로 음수면 음수 양수면 양수가나오도록 출력하려면?
		System.out.println(num >=1 ? "양수" :(num < 0 ? "음수" : "0"));
		
		int aa = 456; //->백의자리까지만 표기되도록출력하시오
		System.out.println(aa/100*100); //int라서 소수점날라감 나눠서 소수점으로 만들고 곱해버림
		
		int b = 777; //->331로 만들어라 777이면 771이 되도록
		System.out.println(b/10*10+1);
		int d = 24; 
			System.out.println((d/10+1)*10-d);
			System.out.println(10-(d%10));
			
			int fahrenheit = 100; //소수점셋제짜리에서 반올림
			float celcius = (5/9f*(fahrenheit-32));
			System.out.println("Fahrenheit."+ fahrenheit);
			System.out.println("Celcious:"+celcius);
			System.out.println((int)((5/9f * (fahrenheit-32))*100+0.5)/100f);
			// 인트형으로 바꾸고 
			
			char ch1 = 'z';          //-->영문자이거나 숫자일떄 트루나오도록
			boolean ch1 = ('a'<=ch1&&ch1 <='z' || 'A'<=ch1&&ch1<='Z' || '0'<= ch1&&ch1 <='9');
			System.out.println(ch1); // ->||or && and
			
		
			
	}

}
