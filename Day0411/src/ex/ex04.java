package ex;

public class ex04 {
 //369 게임
	public static void main(String[] args) {
	/*	 for (int i=1; i<=100; i++) {
		 System.out.printf("i=%d", i);
		 
		 int tmp = i;
		 
		 do {
			 // tmp%10 이 3의 배수인지 확인(0제외)
			 if(tmp%10%3==0 && tmp%10!=0)
				 System.out.print("짝");
			 // tmp /= 10은 tmp =tmp / 10과 동일
		 } while((tmp/=10)!=0);
		 System.out.println();
	}

}
}  */   //do- while  -> for
		
		for(int i = 1; i <=100; i++) {
			System.out.printf("i=%d", i);
			
			int tmp = i;
			
			for(;;) {
			
				
				if(tmp %10%3 == 0 && tmp % 10 !=0)
					System.out.print("짝");
				
				if((tmp/=10) == 0)
					// if (0==0)
					break;
			}
			System.out.println();
		}
	}  //실행순서 생각해보기
}
	