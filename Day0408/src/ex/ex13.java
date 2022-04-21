package ex;

public class ex13 {

	public static void main(String[] args) {
		// 2단2줄만 3단3줄 4단4줄만 출력되도록
		
		for(int i = 2; i<=9; i++)
			for(int j = 1; j<=i; j++)// 그냥 i값을 j에 넣어줌
				
		//System.out.println(i*j); //그냥 하면 심심하니
		System.out.println(i + "X" + j+ "= " + i*j);
		
		System.out.println(" ");
			
	}

}
