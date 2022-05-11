package ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Listiterater {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("toy", "box", "robot", "box");
		
		System.out.println(list);
		
		list = new ArrayList<String>(list);
		
		ListIterator<String> it = list.listIterator(); //양방향 참조
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str + "\t");
		}
		
		System.out.println();
		while(it.hasPrevious()) {
			String str = it.previous();
		}
		System.out.println();
		for(Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.println(itr.next()+ "\t");
		}
	}

}
