package ex;
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int num = 0;
		int sum = 0;
		int sum2 = 0;
		int count = 0;
		
		for(int i = 0; i<101; i++) { //101로 잡았으니 sum = i+1 안해도댐 0부터시작
			sum += i;
			
		
			if(i%2 == 0 && i%7==0) {  //2의배수는 2로나눠서 나머지0이니까 이렇게 조건식 넣어라
				count++; sum2 +=i;
				System.out.print(i + ",");
				int[]nArr = new int[count];
				int j = 0;
				nArr[j++] = i;
		        
				System.out.println("\n"+ Arrays.toString(nArr));
			}
		}
		System.out.println();
		System.out.println("총합" + sum);
		System.out.println("평균" + sum/100);
		
		System.out.println("2의배수,7의배수" + count);
		System.out.println("중복배수총합" + sum2);
	
	}

}
