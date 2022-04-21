package ex;

public class ex08 { //1+(-2)+3+(-4).... 과같은식 몇까지 더해야 100이상이 되는가?

	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		int sign = 1;
		int tmp = 0;
		
		for(i = 1; true; i++, sign = -sign) {
			sum += i;
			
			tmp = i*sign;
			
			if (sum>=100)
				break;
		
			System.out.println(sum);
		}
		System.out.println("i : " + i + "tmp : " + tmp + "sum : " + sum);
	}

}
