package ex;

public class ex7_22 {

	public static void main(String[] args) {
		Shape s = new Circle(); 
		Shape s2 = new Circle(new Point(10,10), 10);
		Shape s3 = new Circle(5);
		Shape r 	= new Rectangel();
		Shape r2 = new Rectangle(150,50);
		Shape r3	=	new Rectangel(new Point(100,100),150,50);
		System.out.println(r3.cacleArea());
	}

}
abstract class Shape{
	Point p;
	
	public Shape(){}
	public Shape(Point p){
		this.p=p;
	}
	abstract double calcArea();
	
	Point getPosition() {
		this.p = p;
	}
		void setPoistion(Point P) {
			this.p = p;
		}
}
double c
class Point{
	int x;
	int y;
	
	Point(){
		this(0.0);
	}
	Point(int x, int y) {
		this.x= x;
		this.y= y;
	}
	public String toString() {
		return"["+x+","+y+"]";
	}
}
class Circle extends Shape{
	double r;
	public Circle() {}
	public Circle(double r) {
		super(new Point(0,0));
		this.r=r;
	}
	public Circle(Point p, double r) {
		super(p);
		this.r=r;
	}
	
	double calcArea() {
		return 0;
	}
	
}
class Rectangle extends Shape{
	double width;
	double height;
	public Rectangle() {}
	public Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	double cacleArea() {
		return width*height;
	}
	boolean isSquare() {
		//if(width == height && width !=0 && height !=0)
		if(width == height && width*height !=0)
		return true;
		else
			return false;
	}
}