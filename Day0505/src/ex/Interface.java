package ex;

import sun.tools.jconsole.Plotter.Unit;

public class Interface {

	interface Repairable {}
class GroundUnit extends Unit {
	 GroundUnit(int hp) {
		 super(hp);
	 }
	}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class unit {
	int hitPoint;
	final int MAX_HP;
	Unit(int hp){
		MAX_HP = hp;
	}
}

class Tank extends GroundUnit implements Repairable{
	Tank(){
		super(150); //탱크 hP는 150이다
		hitPoint = MAX_UP
				
	}
	public String toString()
	return "Tank"
	
}
}
class Marine extends GroundUnit{
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable{
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	void repair (Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
		}
	}
}
	
	
	
	
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
	
		scv.repair (tank);
		//scv.rapair (marine);
	

}
