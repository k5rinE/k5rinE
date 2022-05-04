package ex;

import java.util.HashSet;

public class ex02 {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(100);  
		set.add(100);  
		set.add(500);  
		
		for(int i = 0; i<set.size(); i++)
			System.out.println(set.toString());   
	}

}

class Num{
	private int num;
	
	public Num(int n) {
		num = n;
	}
}
//	@Override
//	public int hashCode() {
//		System.out.println("hashCode");
//		return num %3;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		
//		return num == ((Num)obj).num;
//	}
//	@Override
//	public String toString() {
//		return String.valueOf(num);
//	}
//}