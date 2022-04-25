package ex;

public class Tv { //책 239P

//Tv의 속성 (멤버변수)
	String clolor;	//색상
	boolean power;	//전원상태
	int channel;	//채널
	
	//Tv의 기능(메서드)
	void power()        { power = !power; }
	void channelUp()	{++channel; }
	void channelDown()	{--channel; }
}

class Tvtest {
	public static void main(String args[]) {
		Tv t;			//Tv인스턴스를 참조하기위한 변수 t선언
		t = new Tv();	// Tv인스턴스 생성 -- >이걸 만들어야 밑에것도 만듦.
		t.channel = 7;	//Tv 인스턴스 멤버 변수 channel의 값을 7로 한다.
		t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다
		System.out.println("현재 채널은 " + t.channel + "입니다");
		
		Tv t2;			//Tv인스턴스를 참조하기위한 변수 t선언
		t2 = new Tv();	// Tv인스턴스 생성
		t2.channel = 20;	//Tv 인스턴스 멤버 변수 channel의 값을 7로 한다.
		t2.channelUp(); // Tv인스턴스의 메서드 channelDown()을 호출한다
		System.out.println("현재 채널은 " + t2.channel + "입니다");
		
		Tv t3 = t2;
		System.out.println("t3 " + t3.channel);
		
	
	
	}
}