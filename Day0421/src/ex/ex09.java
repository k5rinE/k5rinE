package ex;

import java.util.Arrays;

public class ex09 {

	public static void main(String[] args) {
		  int[] num = new int[8];

	      for(int i=0;i<num.length;i++) {
	         num[i]+=(int)(Math.random()*10);
	         for(int j=0;j<i;j++) {
	            if(num[i]==num[j]) {
	               num[i]=0;
	               i--;    //
	            }
	            
	         }
	         
	      }
	      System.out.println(Arrays.toString(num));
	      
	   }

	
		
	}


