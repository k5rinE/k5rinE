package ex;

public class ex06 {

	public static void main(String[] args) {
		int sum = 0;
		int i =0;
		
		while(true) {
			if(sum>100)
				break; // 없으면 계속 돌아서 밑에 안가서 오류남
			++i;
			sum +=i;
		}
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}

}
