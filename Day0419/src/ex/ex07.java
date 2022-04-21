package ex;

public class ex07 {

	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};
		
		for(int i=0; i<names.length; i++)
			System.out.println("names["+i+"]:"+names[i]);
		
		String tmp = names[2];		//배열 3번째요소를 tmp에 저장
		System.out.println("tmp:"+tmp);
		names[0] = "Yu";		// 배열 names의 첫 번쨰 요소 "Kim" -> "Yu" 로
		
		for(String str : names)  // 향상된 for문
			System.out.println(str);
	}

}
