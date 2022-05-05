package ex; //도형 만들기

class Exercise7_22 {
	public static void main(String[] args) {
		
		Shape shape = new Circle(new Point(10, 10), 10);  //shape로 Circle 참조 point 값 넣어줌 오버라이딩해서 호출됨
		System.out.println(shape.calcArea());
		
		

		shape = new Rectangle(new Point(10, 10), 10.2, 10.4); //shape로 Rectangle 참조 point 값 넣어줌 오버라이딩해서 호출됨
		System.out.println(shape.calcArea());

	}

}

abstract class Shape {
	int x = 100;
	Point p;

	Shape() {
		this(new Point(0, 0));
	}

	Shape(Point p) {
		this.p = p;
	}

	abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

class Circle extends Shape {
	int x = 200;
	double r;

	public Circle() {
	}

	public Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape {
	double width;
	double height;

	public Rectangle() {
	}

	public Rectangle(Point p, double w, double h) {
		super(p);
		width = w;
		height = h;
	}

	boolean isSquare() {
		if (width == height)
			return true;
		return false;
	}

	@Override
	double calcArea() {
		return width * height;
	}
}

class Point {
	int x;
	int y;

	Point() {
		this(0, 0);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "[" + x + "," + y + "]";
	}
}