package com.ezen01;

public class Thread01 {

	public static void main(String[] args) {
//Thread ct = Thread.currentThread();
//String name = ct.getName();
//System.out.println(name);
		
		//람다식
		Runnable task = ()->{
			int n1 = 10;
			int n2 =20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " , " + (n1+n2));
		};
	}
	Thread t = new Thread(task);
	t.start();
	sysout

}
-----------