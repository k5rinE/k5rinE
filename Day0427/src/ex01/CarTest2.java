package ex01;

public class CarTest2 {
   public static void main(String[] args) {
	   Sedan se = new Sedan();   // -> 특정차 (세단)을 추가 시킴 se 라는 이름안에 세단정보(Car+Sedan)가 있음
	   se.setColor("red");
	   System.out.println(se.getColor());
	   
	   se.setPassenger(4);
	   System.out.println(se.getPassenger()+"명");
	   
	   Sedan se2 = new Sedan("bule", 2, 4,3);		//그냥 이것만 넣으면 오류 나기떄문에
			  System.out.println(se2.getPassenger()+"명");
			  System.out.println(se2.getColor());
			  
			  Sports sp = new Sports();
			  sp.setColor("red");
			  System.out.println(sp.getColor());
			  
			  Sports sp2 = new Sports("yollow", 2,4,1,5000);
		
   }
}
class Car{						//공통된 요소 겹치는거(중복) Car로 넣어주고 상속받게 만들어서 글자수 줄임 
	private int passenger;
	private int tire;
	private int seat;
	
	public Car() {}
	public Car (int passenger, int tire, int seat) {
		System.out.println("Car()생성자");
		this.passenger = passenger;
		this.tire = tire;
		this.seat = seat;
	}
	void run() {
		System.out.println("달료~");
	}
	void stop() {}
	
	public int getPassenger() {                //-------------------------- shft+art +s        
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}		///---------------------------------------------------------------------
}
class Sports extends Sedan{
		int horsepower;
		public Sports() {}
		
		public Sports(String color, int passenger, int tire, int seat, int horsepower) {
			super(color, passenger, tire, seat);
			this.horsepower = horsepower;
}
}
class Sedan extends Car {  // 세분화된 Sedan에 extends + Car(상복받을 클래스) 붙여서 상속 받겠다 선언
	private String color;
	public Sedan() {}
	public Sedan(String color, int passenger, int tire, int seat) {   //->se2를 생성자
		super(passenger, tire, seat); //super는 {안에 맨위에 있어야함
		System.out.println("Sedan()생성자");
		this.color = color;
		setPassenger(passenger);
		setTire(tire);
		setSeat(seat);

}
	public String getColor(){  //겟셋만들어주기 
		return color;
	}
	public void setColor(String Color) {
		this.color = color;
	}
	void gas() {}
}
     
class Bus {
	
	int passengerCount;
	void passengerLoad() {}
}

class Truck{
	int load;
	void ObjectLoad() {}
}
