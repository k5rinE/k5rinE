package Op;

public class mm3 {

	public static void main(String[] args) {
		int x = 15 ;
	      
	      System.out.println(10 < x && x < 20) ;

	      char ch ='a';
	      System.out.println(ch != ' ' || ch != '\t') ;
	      
	      char ch2 ='x';
	      System.out.println(ch2 == 'x' || ch2 == 'X');
	      
	      char ch3 = '5';
	      System.out.println((ch3>='0' && ch3 <='9'));
	      
	      char ch4 = 'a';
	      System.out.println((ch4>='A' && ch4 <='Z') || (ch4 >='a' && ch4 <='z'));
	      
	      int year = 2022;
	      System.out.println((year%400==0) || (year%4 ==0) && (year%100 !=0));
	   
	      System.out.println(year/4.0);
	      
	      boolean powerOn=true;
	      System.out.println("7 : "+ !powerOn);
	      
	      String str = "yes";
	      System.out.println("8 :" + str.equals("yes));

	}

}
