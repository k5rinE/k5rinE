package ex;

public class ex01 {

	public static void main(String[] args) {
		
		// 버스 기본요금 1500 이라고 가정
		
		int x = 1500;
		
		int age= (int)(Math.random()*100);
				
		
		if (age>=0 && age<=3) {
			
			System.out.printf("%d세의 비용은 : %d원입니다" , age ,(int)(x-(x*1)));
		}
			
		else if (age>=4 && age<=13) {
			System.out.printf("%d세의 비용은 : %d원입니다" , age ,(int)(x-(x*0.5)));
		}
				
				
			else if (age>=14 && age<=19) {
				System.out.printf("%d세의 비용은 : %d원입니다" , age ,(int)(x-(x*0.75)));
			}
					
					
		
			else if (age>=20 && age<=64) {
				System.out.printf("%d세의 비용은 : %d원입니다" , age ,x);
			}
		
			else if (age>=65) {
				System.out.printf("%d세의 비용은 : %d원입니다" , age ,(int)(x-(x*1)));
			}
		
				
	
		
		
		
	}

}
