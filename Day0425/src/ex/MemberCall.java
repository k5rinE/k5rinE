package ex;

 class MemberCall {
	 int iv = 10;
	 static int cv = 20;
	 int iv2 = cv;
	 
	 //static int cv2 = iv;
	 static int cv2 = new MemberCall().iv;
	 
	 static void staticMethod1() {
		 System.out.println(cv);
	//	 System.out.println(iv);
		 MemberCall c = new MemberCall();
		 System.out.println(c.iv);
		  
	 }
	 
	 void instanceMethod1() {
		 System.out.println(cv);
		 System.out.println(iv);
	 }
	 static void staticMethod2() {
		 staticMethod1();
		 //instanceMethod1();
		 MemberCall c = new MemberCall();
		 c.instanceMethod1(); 
	 }
	 void instanceMethod2() {
		 staticMethod1();
		 instanceMethod1();
	 }
	 
	

	

}
