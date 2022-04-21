package Op;

public class ex02 {

	public static void main(String[] args) { //ctrl+d 한줄삭제
		// 반복문 : 
		
		//for    조건이 거짓히면 실행이 한 번도 안될 수 있다.
		//while 	
		//do-while 조건이 거짓이어도 한번은 실행
		
		int sum=0;
		
		//for 1회만 실행; 조건이 true 일뺴 반복, 값을 변동
		for(int i=0; i<=5; i++) //i를 하나씩 더할때 5가 댈때까지 다더함
								// 0 1 3 6 10 15
			sum +=i;
		
		System.out.println("sum = " +sum);
		
		
		for(int i=0; i<=10; i+=2) //
									// 2 4 6 8 10
			sum +=i;

		System.out.println("sum = " +sum);//246810 //30인데 위에꺼랑 더해져서 45
		
		
		
		for(int i=10;  i>0; i--) //
		
			sum += i;
		System.out.println("sum = " +sum);// 55인데 위에꺼랑 더해져서 100
		
		int m = 0;
		int p= 0;
		
		for ( ; p<6; ) {
			p += m++;
			System.out.println("m : "  + " , p = " + p);
		}
		System.out.println("m = " + m + " Last p = " + p);
		}
		
		//끊어서 더하기 다시한번해보기
	}


