
public class ex02 {

	public static void main(String[] args) {
		// 'A', '1' 문자(char) m, "ABC" 문자열(String)
		// '' 사이에는 문자 1개
	/*boolean a = true;
	boolean b = false;
	
	char c = 'K';
	 //char cc = 'kk';

	int i = 10;				//
	short d = 35;
	float f = 10.2f;
	double fd = 10.5;*/
		int oct = 010; //8진수
		int de = 10;	//10진수
		int hex = 0x10; //16진수
		int bin	= 0b1010; //2진수0
		System.out.println(oct);
		System.out.println(de);
		System.out.println(hex);
		System.out.println(bin);
	
		System.out.println("-----------------------------------");
		System.out.println(Integer.toBinaryString(bin));
		System.out.println(Integer.toHexString(hex));
		System.out.println(Integer.toOctalString(oct));
		
	}

}
