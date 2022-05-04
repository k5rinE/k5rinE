package SamsungLG;

public class TestUser {

	public static void main(String[] args) {

//		SamsungTv tv = new SamsungTv();
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		LGTv tv = new LGTv();
		tv.TurnOn();
		tv.TurnOff();
		tv.SoundUp();
		tv.SoundDown();
	}

}
