package ex;

public class ex09 {

	public static void main(String[] args) {
	
		      
		      gugudan();
		   }
		   
		   //1)  입(x), 출력(x) - > 경우에 수마다 다름
		   public static void gugudan() {
		      
		      int n=3;
		      
		      System.out.println("입력한 " + n + "단 출력");
		      for(int i=1; i<=9; i++)
		         System.out.println(n*i);
		      
		   }
	}

//----------------------------------------------------------------------------------

	public static void main(String[] args) {
    int input=3;
    gugudan(input);
 }
 
 //2)  입(O), 출력(x)
 public static void gugudan(int n) {
    
    //int n=3;
    
    System.out.println("입력한 " + n + "단 출력");
    for(int i=1; i<=9; i++)
       System.out.println(n*i);
    
 }
 }
 
 -------------------------------------------------------------------------------
 public static void main(String[] args) {
     
     boolean flag = gugudan();
     
     if (flag == true)
        System.out.println("출력 성공");
     else
        System.out.println("출력 실패");
        
  }
  
  //4)  입(x), 출력(O)
  public static boolean gugudan() {
     
     boolean flag = true;
     int n = 3;
     
     System.out.println("입력한 " + n + "단 출력");
     for(int i=1; i<=9; i++)
        System.out.println(n*i);
     
     return flag;
     
  }
 --------------------------------------------------------------------------------
 	public static void main(String[] args) {
     
     int input=3;
     
     boolean flag = gugudan(input);
     
     if (flag == true)
        System.out.println("출력 성공");
     else
        System.out.println("출력 실패");
        
  }
  
  //2)  입(O), 출력(O)
  public static boolean gugudan(int n) {
     
     boolean flag = true;
     
     System.out.println("입력한 " + n + "단 출력");
     for(int i=1; i<=9; i++)
        System.out.println(n*i);
     
     return flag;
     
  }
