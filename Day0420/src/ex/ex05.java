package ex;
import java.util.*;
public class ex05 {

	public static void main(String[] args) {
		int  arr []= {9,6,7,3,5};
		
		for(int i = 0; i < arr.length; i++) {
			int index=i;
			
		for(int j = i+1; j < arr.length; j++) {
			if (arr[index] > arr[j]) index = j;
		}
		if(index != i) {
			int tmp = arr[index];
			arr[index]=arr[i];
			arr[i]=tmp;
			
		}
		System.out.println(i+1+"회전 " + Arrays.toString(arr));
	}
		System.out.println(Arrays.toString(arr));
	}
}