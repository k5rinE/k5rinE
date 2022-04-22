package ex;
import java.util.*;
public class ex08 {

	   public static void main(String[] args) {

		   Random rand = new Random(7);
		   Scanner sc = new Scanner(System.in);
		   
		System.out.println("배열 갯수 입력 : ");
		
		int n = sc.nextInt();
		int[] nArr = new int[n];
		
		nArr[0] = rand.nextInt(10);
		
		for(int i =1; i<nArr.length; i++) {
			do {
				nArr[i] =rand.nextInt(10);
			}while(nArr[i] == nArr[i-1]);
			}
		
		System.out.println(Arrays.toString(nArr));
		}

	   }

	
		
	


