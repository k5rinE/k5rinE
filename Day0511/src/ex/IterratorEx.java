package ex;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class IterratorEx {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("toy");
		
		for( String  e : list)
			System.out.print(e + '\t');
		
		//next() >> 다음값 반환
		//hasNext() >> 가져올 데이타 있는가?
		//remove >> next()호출 통해 반환된 인스턴스 삭제
		System.out.println("\n-------------------------------------------------");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("toy")) it.remove();
			System.out.print(str + '\t');
		}
			Iterator<String> it2 = list.iterator();
			System.out.println("\n-------------------------------------------------");
			while(it.hasNext()) {
				String str2 = it.next();
				
				System.out.print(str2 + '\t');
		}
	}

	}

