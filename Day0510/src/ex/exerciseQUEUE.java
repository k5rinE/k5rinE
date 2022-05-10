package ex;
import java.util.LinkedList;
import java.util.Queue;
public class exerciseQUEUE {

	public static void main(String[] args) {
		Queue<String> que = new LinkedList<String>();
//		Queue que = new LinkedList();
//		Que.offer("kor");
//		Que.offer(10);
		
		que.offer("box");
		que.offer("toy");
		que.offer("robot");
		
		System.out.println(que);
		System.out.println(que.peek());
		
		System.out.println(que);
		
		System.out.println(que.poll());
		
		System.out.println(que);
		System.out.println(que.poll());
		
		System.out.println(que);
		System.out.println(que.poll());
		
		System.out.println(que);
		System.out.println(que.peek());
		
	}

}
