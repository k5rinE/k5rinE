package ex;

public class ex05 {

	public static void main(String[] args) {

		// 두배열 요소가 같으면 ture, 틀리면 false 
		int[] nArr1 = {10,20,3,40,50};
		int[] nArr2 = {10,20,3,40,50};
		boolean check = ArrayEqual(nArr1,nArr2);
		
		System.out.print("nArr1 : ");
		for(int i: nArr1)
			System.out.print(i+" ");
		
		System.out.println();
		
		System.out.print("nArr2 : ");
		for(int i: nArr2)
			System.out.print(i + " ");
		System.out.println(" 두 요소는 "+ check);
	}

	//두 배열 비교는 여기서
	static boolean ArrayEqual(int[]n1, int[]n2) {
		
	if(n2.length != n2.length)
		return false;
	
	for(int i=0; i<n1.length; i++)
		if(n1[i] != n2[i])
			
			return false;
			return true;
		

	}
}
