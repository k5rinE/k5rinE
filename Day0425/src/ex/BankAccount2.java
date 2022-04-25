package ex;

public class BankAccount2 { //잔액
	private int balance;
	
	
	//getter, setter ==> get 값 출력 set 값 입력
	
	
	
	int deposit(int amount) {   //입금
		
		balance += amount;
		
		return balance;
	}
	
	int withdraw(int amount) { //출금
	balance -= amount; 
	return balance;
}
	
	int checkBalance() {
		System.out.println("잔액 : " + balance);
		return 0;
	}
	
	}
class MainClass2{
	public static void main(String[] args) { //중복 반복되는 것 배열로 정리
		BankAccount2[] bank = new BankAccount2[3];
		bank[0] = new BankAccount2();  // -> 객체 수동으로 만들어줘야함
		bank[1] = new BankAccount2();
		bank[2] = new BankAccount2();
		
		bank[0].deposit(10000);
		bank[0].withdraw(3000);
		System.out.println(bank[0].checkBalance());
	}
}


//잔액 : 10000
//잔액 : 7000