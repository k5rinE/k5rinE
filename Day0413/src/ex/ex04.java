package ex;
import java.util.Arrays;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		double[] dArr = new double[10];  //  dArr = tmp; 이 new double 을 의미 없게 만듬
		
		for(int i=0; i < dArr.length; i++)
			dArr[i] = (Math.random());			
	
		for(int i=0; i < dArr.length; i++)
		System.out.printf("%.2f\n", dArr[i]);	
	
	double[] tmp = new double[dArr.length * 2];
	
	for (int i=0; i < dArr.length; i++)
		tmp[i] = dArr[i];
	
	dArr = tmp;
	System.out.println("--------------------------------------------------");
	
	for(int i=0; i < dArr.length; i++)
		System.out.printf("%.2f\n", dArr[i]);
}
	

}
