package ex;

public class Tvtest4 {

	public static void main(String[] args) {
		Tv4[] tvArr = new Tv4[3];
		
		for(int i =0; i  < tvArr.length; i++) {
			tvArr[i] = new Tv4();
			tvArr[i].channel = i+10;
		}
		
		for(int i= 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel1=%d%n",i,tvArr[i].channel);
		}
	}

}
class Tv4 {
	String color;
	boolean power;
	int channel;
	
	void power()  { power = !power;}
	void channelUp()  { ++channel; }
	void channeldown()  {--channel; }
}
