package ex;

	class CaptionTvTest{
	private	boolean power;
	private	int channel;
		
		void power()		 { power = !power;}
		void channelUp()	 { ++channel;}
		void channelDown() 	{ --channel;}
	}
	
	class CpspionTv extands Tv {
		private boolean caption;
		void displayCaption(String text) 	{
			if (caption) {
				System.out.println(text);
				
			}
		}
		public extands getTv() {
			return Tv;
		}
		public void setTv(extands tv) {
			Tv = tv;
		}
		public boolean isCaption() {
			return caption;
		}
		public void setCaption(boolean caption) {
			this.caption = caption;
		}
	}
	class CaptionTvTest2{
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		//ctv.channel = 10;
		//ctv.channel(10);
		ctv.channelUp();
		//System.out.println(ctv.channel);
		System.out.println(ctv.channel());
		ctv.displayCaption("Hello, World");
		//ctv.caption = true;
		ctv.caption(true);
		ctv.displayCaption("Hello, World");
}

}
