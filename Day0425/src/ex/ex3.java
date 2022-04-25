package ex;

public class ex3 {

	public static void main(String[] args) {
		Student s = new Student2();
		
		s.name = "홍길동";
		s.ban = 1;		
		s.ban = 1;		
		s.kor = 100;
		s.setkor(100);
		s.eng = 60;
		s.seteng(60);
		s.math = 76;
		s.setmath(76);
		
		System.out.println("이름:" + s.name);
		System.out.println("종점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		
	

}
}

class Student2{
	
	private String name;
	private int ban;
	private int kor;
	private int eng;
	private int math;
	
	public void setName(private String name) {
		this.name = name;
	}



	public void setBan(int ban) {
		this.ban = ban;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public void setMath(int math) {
		this.math = math;
	}



	int getTotal() {
		return kor+eng+math;
	}
	
	
	
	double getAverage() {
		return getTotal()/3.0;
	
	
}
}