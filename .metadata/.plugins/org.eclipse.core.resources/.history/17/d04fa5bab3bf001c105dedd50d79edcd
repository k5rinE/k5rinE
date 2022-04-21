package ex;

public class ex14 {

	public static void main(String[] args) {
	int[][]arr= {
			{5,5,5,5,5},
			{10,10,10,10,10},
			{20,20,20,20,20,20,20},  //배열 객수가 3*3안떨어지고 다를때
			{30,30,30,30,30,30}
			};
	int total = 0;
	float average =0;
	int count=0;
	
	for(int i =0; i<arr.length; i++) 
		for(int j =0; j<arr[i].length; j++) 
			total += arr[i][j];
			count++;
	//average = total/(float)(arr.length*arr[3].length); //왜3이지? 일반적인경우
	//난이도 up 배열수가 각기 다를때
	
	
	//average = total/(float)(arr.length*arr[3].length);
	
	System.out.println("count:" + count);
	average = total / (float)(count);
	
	
	System.out.println("total="+total);
	System.out.printf("average=%.1f"+average);
			
	}
	}


