package Tv;

public class TVCR extends Tv implements IVCR{
	VCR vcr = new VCR();
public static void main(String[] args) {
	TVCR tv = new TVCR();
	
}

@Override
public void play() {
	vcr.play();
	vcr.stop();
	vcr.channelDown();
	System.out.println(tv.gerCounter());
}

@Override
public void stop() { vcr.stop();}

@Override
public void reset() { vcr.reset();}

@Override
public void getCounter() {}

@Override
public void setCounter(int c) {}
	



}
