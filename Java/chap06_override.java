*override
  천원을 예금하면 천원씩 포인트가 쌓인다.

  *부모클래스
  package objectClass;
//은행 계좌 클래스
public class Account {
	//멤버변수(필드, 속성)
	static final String BANKNAME = "신한은행";
	String accountNo; //계좌번호
	String ownerName;//예금주 이름
	int balance;//잔액
	
	//빈 생성자
	public Account() {
		
	}
	//예금한다 메서드
	void deposit (int amount) {//
		balance += amount;
	}
	//생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//인출한다 메서드
	public int withdraw(int amount) throws Exception{
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}
	
	
}

*자식클래스
package objectClass;
//은행계좌(통장) 클래스
public class DockdoAccount extends Account {
	//필드(멤버변수)
	int point; //독도 기부 포인트
	
	//생성자
	public DockdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);
		this.point = point;
	}
	
	//메서드 재정의
	@Override
	void deposit(int amount) {
		super.deposit(amount);//부모의 deposit 메서드를 수행하고 온다.
		point += amount * 0.001;//0.1% 포인트 누적
	}

}

*출력

package objectClass;

public class DockdoAccountEx01 {

	public static void main(String[] args) {
		DockdoAccount min = new DockdoAccount("555-11-77777", "민", 0, 0);
		min.deposit(50000);
		System.out.println("잔액 : " + min.balance);
		System.out.println("기부포인트 :" + min.point);
		
		min.deposit(10000);
		System.out.println("잔액 : " + min.balance);
		System.out.println("기부포인트 :" + min.point);
		
	}
}
