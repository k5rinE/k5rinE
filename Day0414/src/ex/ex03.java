package ex;

public class ex03 {

	public static void main(String[] args) { //1~100까지 랜덤 , 총합 , 평균 구하기

		int sum = 0;
		double avg = 0;
		
		int[] nArr= new int[10];
		
		
			//랜덤 입력
			for (int i=0; i<10; i++)
				nArr[i] = (int)(Math.random()*99)+1;
				
				for (int i = 0; i<10; i++)
				 sum += nArr[i];
				
				//총점, 평균 출력
				System.out.println("총점 : " + sum);
				System.out.println("총점 : " + (double)sum/nArr.length);
		
	}

}

