package ex;
public class ex01 {

	public static void main(String[] args) {
		
	
 Fighter f = new Fighter();
 
 if ( f instanceof Unit)       //객체를 참조하거나 클래스(상속된)를 참조하면 출력함 
	 System.out.println("f는 Unit클래스의 자손입니다.");
 if ( f instanceof Fightable)
	 System.out.println("f는 Fightable인터페이슬르 구현했습니다.");
 if ( f instanceof Movable)
	 System.out.println("f는 Movable인터페이스를 구현했습니다.");
 if ( f instanceof Attackable)
	 System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
 if ( f instanceof Object)
	 System.out.println("f는 Object클래스의 자손입니다.");
 
 
	}
}

class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {   }  //구현한걸로 인정 생략~
	public void attack(Unit u) {   }
}

class Unit{
	int currentHP;
	int x;
	int y;
	
}

interface Fightable extends Movable, Attackable{    }
interface Movable  { void move(int x, int y); }
interface Attackable  { void attack(Unit u); }