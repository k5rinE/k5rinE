package ex;

public class ex01 {

	public static void main(String[] args) {

		//Product pro = new Product(10); ->10
		Product pro = new Audio();
		System.out.println(pro.price);
	}
	
}

class Product { 
	int price; 	//제품 가격
Product(int price) { this.price = price;}

void func() {
	System.out.println("Product");
}
class Tv extends Product { 
	Tv() { super(100); }
	public String toString() { return "Tv"; } 
	} 
class Computer extends Product {
Computer() { super(200); }
	public String toString() 
{return "Computer";} 
} 
class Audio extends Product { 
	Audio() { super(50); } 
	public String toString() { return "Audio"; }
	}
}