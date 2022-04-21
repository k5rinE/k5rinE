package ex01;

public class ex04 {

	public static void main(String[] args) {
		
		//short num = (short)(32787+3); //-32766

		//System.out.println(num);
		
		/*int num = 1;
		int num2 = 0;
		int num3 = 0;
		num = num +1; //2
		num += 1; //3
		++num; //진위형 
		num++; // 후위형
		num2 = ++num;
		num3 = ++num;
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num + "," + num3);
		*/
		int i = 10;
		int j = 0;

		i = i-1;  //9
		i -= 1; //8
		i--; //7
		--i; //6
		
		System.out.println(i);
		
		
		j = i--;
		
		System.out.println(j + " ," + i);
		
		char a = 'a'; //65
		char d = 'd'; //68   b66 c67
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
		System.out.printf("'%c'=%d%n", a, (int)a); 
		System.out.printf("'%c'=%d%n", d, (int)d); 
		System.out.printf("'%c'=%d%n", zero, (int)zero); 
		System.out.printf("'%c'=%d%n", two, (int)two); 

		
	
		
		
	}

}
