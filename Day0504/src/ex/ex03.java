package ex;

import java.util.HashSet;

public class ex03 {

	public static void main(String[] args) {
		HashSet<Num> set = new HashSet<>();
		
		set.add(new Num(100));
		set.add(new Num(200));
		set.add(new Num(300));
		set.add(new Num(100));  //중복되는걸 막아보자   300이 먼저 출력되는건 나머지값 0 1 2 순으로 출력되는듯
		set.add(new Num(100));  
		set.add(new Num(500));  
		
		for(Num n : set)
			System.out.println(n);   //이것만 있으면 주소 값이 나옴
	}

}

class Num{
	private int num;
	
	public Num(int n) {
		num = n;
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return num %3;
	}
	@Override
	public boolean equals(Object obj) {
		
		return num == ((Num)obj).num;
	}
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}