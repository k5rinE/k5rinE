package ex;

public class BankAccount { //잔액
	private double balance;
	private double sum;
	
	//getter, setter ==> get 값 출력 set 값 입력
	
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	
	double deposit(double amount) {   //입금
		balance += amount;
		
	return balance;
	}
	
	double withdraw(double amount) { //출금
	balance -= amount; 
	return balance;
}
	
	void checkBalance() {
		System.out.println("잔액 : " + sum);
	}
	
	}
class MainClass{
	public static void main(String[] args) { //프린트 찍지말고 출력
		
		BankAccount kim = new BankAccount();
		
		kim.deposit(10000);
		kim.checkBalance();
		kim.withdraw(3000);
		kim.checkBalance();
		System.out.println("-----------------------------");
		BankAccount Park = new BankAccount();
		Park.deposit(50000);
		Park.checkBalance();
		Park.withdraw(35000);
		Park.checkBalance();
		System.out.println("-----------------------------");
		BankAccount Lee = new BankAccount();
		Lee.deposit(15000);
		Lee.checkBalance();
		Lee.withdraw(5000);
		Lee.checkBalance();
		
		// bank.deposit = 10000; ->이렇게하면 데이터 무결성이 떨어짐
		// park
		//Lee 씨 계좌생성
		System.out.println("------------------------");  // ->아예 이씨계좌 내용이 김씨계좌내용으로 다바뀜 출금이니 입금이니 전부
		Lee = kim;  // --> Lee 돈을 김돈으로 바꿈   15000 -->10000
		Lee.checkBalance(); 
		Lee.deposit(10000); //-> 위 김씨상태에서 10000원 이씨이름으로 입금 10000-3000+10000-> 17000
		
	}
}


//잔액 : 10000
//잔액 : 7000