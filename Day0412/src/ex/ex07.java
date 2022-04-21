package ex;

public class ex07 {

	public static void main(String[] args) { // 프로세스 를 구구단으로 설정 2넣으면 2단쭉나오도록
												// 프로그램 순서 파악하여 스스로짤떄 공부
		int input=5;  //구구단 단수
		
		gugudan(input);
		
		System.out.println("프로그램 종료!!");
	}
	public static void gugudan(int input) { //n이 오는데 왜 위에 input에 들어가게 대는지  
		System.out.println("입력한 " + input + "단 출력"); //void반환형  return 쓸필요업음
		
		for(int i=1; i<=9; i++)
			System.out.println(input*i);  // gugudan 으로 묶임 위에 식과 함께
											// 밑에 input은 무슨 글자로 바꿔도 상관없음
	}
		
}
