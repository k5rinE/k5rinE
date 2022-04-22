package ex;
import java.util.Arrays;
public class ex07 {

	   public static void main(String[] args) {
	      int[] n = new int[8];
	      int count=0;
	      for(int i=0;i<n.length;i++) {
	         n[i]+=(int)(Math.random()*10);
	         for(int j=0;j<i;j++) {
	            if(n[i]==n[j]) {
	               n[i]=0;
	               i--;
	            }
	            
	         }
	         
	      }
	      System.out.println(Arrays.toString(n));
	      
	   }

	
		
	}


