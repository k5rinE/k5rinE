
public class ex01 {
@Getter
@Setter
@ToString
	public static void main(String[] args) {
		
		int num=10;
		
		Student2 s = new Student2();
		
		s.name = "홍길동";
		s.ban = 10;
		
		System.out.println(s.name);
		System.out.println(s.ban);
		System.out.println(s.math);
		s.getAverage();
		
		System.out.println("---------------------");
		
		Student2 s2 = new Student2();
		s2.name = "이순신";
		s2.kor=90;
		s2.eng=80;
		s2.math = 90;
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.math);
		System.out.println("총점 : " + s2.getTotal());
		System.out.println("평균 : " + s2.getAverage());
		
		System.out.println("----------------------");
		
		Student2 s3 = new Student2();
		
		s3 = s;
		System.out.println(s3.name);
		System.out.println(s3.ban);
		System.out.println(s3.math);
		s.getAverage();
		s.setName("홍길동");
		int kor = s.getkor();
		
	}
}

// private < default < protected < public

class Student2{
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	//getter
	
	
	String getTotal() {
		int sum = kor+eng+math;
		return name;
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
	public String getName() {
		return name;
	}
	//함수 --> 인스턴스메소드, 클래스메소드
	int getkor() {
		return kor;
	}
	
	void setkor(int kor) {
		this.kor = kor;
	}
	int getban() {
		return ban;
	}
	
	void setban(int ban) {
		this.ban = ban;
	}
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	void setName(String name) {
		this.name = name;
		
	}
	
	double getAverage() {
		return getTotal()/3.0;
	}
}