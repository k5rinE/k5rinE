package ex;

class MyTv3 {
	
	boolean isPowerOn;
	int channel;
	int volume;
	int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 0;
	
	

	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		prevChannel = this.channel;						//이전 채널 생성자 추가
		this.channel = channel;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}


	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}


	public int getMAX_CHANNEL() {
		return MAX_CHANNEL;
	}


	public int getMIN_CHANNEL() {
		return MIN_CHANNEL;
	}


void gotoPrevChannel() {
	setChannel(prevChannel);     	//이전채널 메서드 추가 
}
}
		
class exer2 {
public static void main (String args[]) {
	MyTv3 t = new MyTv3();
	
	t.setChannel(10);
	System.out.println("CH:"+t.getChannel());
	t.setChannel(20);
	System.out.println("CH:"+t.getChannel());
	t.gotoPrevChannel();
	System.out.println("CH:"+t.getChannel());
	t.gotoPrevChannel();
	System.out.println("CH:"+t.getChannel());
}
}

