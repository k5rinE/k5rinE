`package ex;
import java.util.*;
public class ex02Arr {

	public static void main(String[] args) {
		   int[] num = new int[5];  
	        int tmp;
	        //---------------------------------------------------------
	        
	      for(int i = 0; i<num.length; i++)
	      num[i] = (int)(Math.random()*99)+1;
	   
	      System.out.println(Arrays.toString(num));
	//------------------------------------------------------------------------
	      for(int i=0; i<num.length; i++) {
	         for(int j=0; j<num.length; j++) {
	            if(num[i]>num[j]) {
	               tmp = num[i];
	               num[i] = num[j];
	               num[j] = tmp;
	            }
	         }
	      }  
	     System.out.println("> 출력 :");
	     System.out.println(Arrays.toString(num));
	               //---------------------------------------------------------
	               for(int i=0; i<num.length; i++) {
	                   for(int j=0; j<num.length; j++) {
	                      if(num[i]<num[j]) {
	                         tmp = num[i];
	                         num[i] = num[j];
	                         num[j] = tmp;
	            }
	         }
	      }
	      //----------------------------------------------------------------
	     System.out.println("< 출력 :");
	     System.out.println(Arrays.toString(num));
	   
	   }
		}


