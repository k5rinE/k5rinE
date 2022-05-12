package ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(3, "kim");
		map.put(4, "hong");
		map.put(4, "lee");
		map.put(4, "lee2");
		map.put(5, "park");
		map.put(6, "kim");
		map.put(4, "kim");
		
		System.out.println(map);			//
		System.out.println(map.get(5));   // 앞 key값 넣으면 뒤에 글자나옴
		
	Set<Integer> set	= map.keySet();
	for(Integer n : set)				//key 값
		System.out.print(n+ "\t");
	System.out.println();
	
	for(Integer n : set)				//value 값
		System.out.print(map.get(n) + "\t");
	
	System.out.println();
	Iterator<Integer> itr= set.iterator();
	while(itr.hasNext())
		System.out.print(map.get(itr.next()) + "\t");
	}

}
