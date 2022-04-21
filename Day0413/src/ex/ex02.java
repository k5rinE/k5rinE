package ex;

public class ex02 {

	public static void main(String[] args) {
		int[] score = new int [10];
		
	int k = 1;
	
	score[0] = 50;
	score[1] = 60;
	score[k+1] = 70; // score[2] =70
	score[3] = 80;
	score[4] = 90;
	score[5] = 90;
	score[6] = 90;
			
	int tmp = score[k+2]+ score[4];
	//for문으로 모든요소 출력
	for (int i=0; i <score.length; i++) { //쭉걍다나오게 하는것 score.length
		System.out.printf("score[%d]:%d%n",i,score[i]);
		
	}
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n", 7, score[7]); //index의 범위를 벗어난 값
	}

}
