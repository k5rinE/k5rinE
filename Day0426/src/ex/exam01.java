package ex;

public class exam01 {

	public static void main(String[] args) {
		Student3 s	= new Student3();
		s.name("홍길동");
		s.ban(1);
		s.no(1);
		s.kor(100);
		s.eng(60);
		s.math(76);
		
		System.out.println("이름: " + s.getname());
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
		
	}

}

class Student3 {
private	String name;
private		int ban;
private		int no;
private		int kor;
private	int eng;
private	int math;
	
	int getTotal() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
}