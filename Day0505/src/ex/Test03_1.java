package ex;



public class Test03_1 {

	public static void main(String[] args) {
	   A a = new A();
	   a.testA();
	   a.test();
	   A a1 = new B();
	   a1.testA();
	   a1.test();
	   A a2 = new C();
	   a2.testA();					//test A
	   a2.test();                  //test C
	 //  System.out.println(a2.a);
	   
	
	   
	   
	 //  B bb = (B)a1;
	  // bb.testB();
	//   bb.testA();
	  // bb.testC();   C는 안댐
	   
	 //  System.out.println(bb.a);
	   //C cc = a1;  // C cc = new B(); --> 하위클래스 상위클래스 참조X
	   
	   					//bb.b;  가능
	   
//	   C cc = a1;	(x)
//	   C cc = a;	(x)
//	   C cc = a1; (x)
	//   C cc = (C)a1;
	 //  System.out.println(cc.a);
	//   System.out.println(cc.b);  //상속받기 떄문에 '접근'은 가능
	//   cc.testA();
	//   cc.testB();
	   
	   
	  // B b = new A();  //하위가 상위 참조X
	   B b1 = new B();  
	   B b2 = new C(); 
	//   System.out.println(b2.a);
	   
	   //C c = new A();   //하위가 상위 참조X
	   //C c = new B();		//하위가 상위 참조X
	 //  C c = new C();
	}

}
