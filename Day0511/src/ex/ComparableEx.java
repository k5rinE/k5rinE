package ex;

class Point{
	int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public String toSting() {
		return "Point [x=" + x + ", y =" + y +"]";
		
		@Override
		public boolean equals() {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}
		
	}
	
}
public class ComparableEx {

	public static void main(String[] args) {
		List<Point> point = new ArrayList<Point>();
		
		Point.add(new Point(10,20));
		Point.add(new Point(50,10));
		Point.add(new Point(30,30));

	}

}
