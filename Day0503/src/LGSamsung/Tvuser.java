package LGSamsung;

public class Tvuser {

	public static void main(String[] args) {
//		LG tv= new LG();
//		tv.PowerOn();
//		tv.PowerDown();
//		tv.VolumeUp();
//		tv.VolumeDown();
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.PowerOn();
		tv.PowerDown();
		tv.VolumeUp();
		tv.VolumeDown();
	}

}
