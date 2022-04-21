package Op;

public class ex01 {

	public static void main(String[] args) {
		
	System.out.println("1" + "2");       //12
	System.out.println(true + "");		// true ->문자형인식
	System.out.println('A' + 'B');		//65+66 ->131
	System.out.println('1' + 2);		//? 49(유니코드)+그냥2 ->51   0->아스키 48
	System.out.println('1' + '2');		//?	99
	System.out.println('J' + "ava");	//74ava //이건뭐야J왜유니코드안나옴-> 문자열이더해져서 앞에것도 문자열로 바뀜
	//System.out.println(true + null);	//? 에러
	
	형변환을 생략할 수 있는 것은?
			
			byte b = 10:
			char ch = 'A'
			int i = 100
			long l = 1000L:
			
			
			
			
			b = (byte)i: 				//o
			ch =(char)b:				//o
			short s = (short)ch:		//o
			float f = (float)I:			//
			i = (int)ch:				//o

			a. b = (byte)i; // int(4byte) → byte(1byte)이므로 반드시 형변환 필요
			b. ch = (char)b; // byte(1byte) → char(2byte)이지만 범위가 달라서 형변환 필요 책29P     
			c. short s = (short)ch; // char,short은 2byte이지만 범위가 달라서 형변환 필요 
			d. float f = (float)i; // float(4byte)의 범위가 long(8byte)보다 커서 생략가능 
			e. i = (int)ch; // char(2 byte) → int(4byte)이므로 생략가능
			
			
				//https://sunnoes.tistory.com/79
			https://dev-mongdal.tistory.com/10
		
			byte b = 256; 127까지라안댐
			char c = ''; 	한칸띄면댐
			char answer = 'no; char를 지움
			
		
				
				
				
				
	}

}
