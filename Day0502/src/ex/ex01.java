package ex;

public class ex01 {

	 public static void main(String[] args) {                              
	      C c = new C(1,2,3);
	      A c2 = new C(1,2,3);
	      B c3 = new C(1,2,3);
	      System.out.println(c2.a);
	      System.out.println(c3.a+","+c3.b);
	      System.out.println(c.a+","+c.b+","+c.c);
	      
	      System.out.println();
	      
	      A c4 = new D();
	      System.out.println(c4.a);
	      
	      System.out.println();
	      
	      c.funcA();
	      c.funcB();
	      c.funcC();
	      
	      System.out.println();
	      
	      if(c instanceof B) {   //c가 참조하고있는 대상이 B를 상속한 아이(C)
	      A cc = (C)c;
	      cc.funcA();
//	      cc.funcB();
//	      cc.funcC();
	      }
	      
	      System.out.println();
	      
	      if(c instanceof B) {   //c가 참조하고있는 대상이 B를 상속한 아이(C)
	      C ccc = (C)c;
	      ccc.funcA();
	      ccc.funcB();
	      ccc.funcC();
	      }
	      
	      System.out.println();
	      
	      A c5 = new C(100,200,300);
	      if(c5 instanceof B) {
	         B cc = (B)c;
	         cc.funcA();
	         cc.funcB();
	      }
	   }
	}

	class A{
	   int a;
	   A(){};
	   void funcA() {
	      System.out.println("aaa");
	   }
	   public A(int a) {
	      this.a =a;
	   }
	}
	class B extends A{
	   int b;
	   B(){};
	   void funcB() {
	      System.out.println("bbb");
	   }
	   public B(int a, int b) {
	      super(a);
	      this.b =b;
	   }
	}
	class C extends B{
	   int c;
	//   C(){};
	   void funcC() {
	      System.out.println("ccc");
	   }
	   public C() {
	      this(0,0,0);
	   }
	   public C(int i, int j) {
	      this(i,j,0);
	   }
	   
	   public C(int i, int j, int k) {
	      super(i,j);
	      this.c=k;
	   }
	   
	//   public C(int a,int b, int c) {
//	      super(a,b);
//	      this.c =c;
	//   }
	}

	class D extends A {
	   int d;
	//   D(){};
	   D() {
	      super(100);
	   }
	   void funcD () {System.out.println("DDDD");
	   }
	}