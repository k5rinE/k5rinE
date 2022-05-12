import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//중복 x , 순서 x
class Num{
	}

	private int num;
	public Num(int num) {this.num	= num;}
	
	@Override
	public String toString() {
		return  String.valueOf(num);
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return num % 3;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this.num == ((Num)obj).num)
				return true;
				else
			return false;
	}
	
}
public class HashSetEx01 {
	
public static void main(String[] args) {
	
	Set<Num> set = new HashSet();   //<>에 int 말고 Integer 넣고 숫자 쓰면 그거도댐 
	
	set.add(new Num(5));
	set.add(new Num(1));
	set.add(new Num(3));
	set.add(new Num(2));
	set.add(new Num(5));
	
	System.out.println("cnt:" +set.size());
	
	for(Iterator<Num> itr=set.iterator(); itr.hasNext();){
		System.out.print(itr.next() + "\t");
	}
	System.out.println();
	
	for(Num s : set)
		System.out.print(s + "\t");
	
}
}
