package ex;

public class ex02 {

	public static void main(String[] args) {
		Buyer b = new Buyer(); 
		b.buy(new Tv()); 
		b.buy(new Computer());
		b.buy(new Tv()); 
		b.buy(new Audio()); 
		b.buy(new Computer()); 
		b.buy(new Computer()); 
		b.buy(new Computer()); 
		
		b.summary();
	}

}
class Buyer { 
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여" +p+ "을/를 살 수 없습니다."); //프린트 찍어가면서 한단계씩 만들어나감
			return;
	}
		money -= p.price; //가진돈에서 가격 뺀다
		add(p);  //add매서드 호출
}

void add(Product p) {
	if(i>=cart.length) {
		Product[]tmp = new Product[cart.length*2];
		System.out.println("before - tmp :" + tmp.length);
		//tmp = Array.copyof(cart,cart.length);
		System.out.println("after - tmp: " + tmp.length);
		
		System.arraycopy(cart,0,tmp,0,cart.length);
		
		cart=tmp;
	}
	cart[i++]=p;
}

void summary() {
	String itemList = "";
	int sum = 0;
	
	for(int i =0; i<cart.length; i++) {
		if(cart[i]==null)
			break;
		itemList += cart[i]+",";
		sum+=cart[i].price;
	}
	System.out.println("구입한 물건:" + itemList);
	System.out.println("사용한 금액:" + sum);
	System.out.println("남은 금액:" + money);
}
}
class Product { 
	int price; 	//제품 가격
Product(int price) { this.price = price;}
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

