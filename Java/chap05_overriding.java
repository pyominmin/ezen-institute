*overriding
오버라이딩(재정의)
  ex)부모에게 물려받은 식당을 고쳐쓰는 것

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
	public void deposit (int amount) {//
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
//마이너스 통장 클래스(대출통장)	
public class CreditLineAccount extends Account {//부모의 것을 상속 받은 메서드에 오타가 나면 새로운 매서드가되고 오버라이딩됐다고 하지 않는다. 
	// 필드(멤버변수)
	int creditLine; // 마이너스 한도

	// 생성자
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	// 인출한다 메서드(재정의)
	@Override//어노테이션-오타방지
	public int withdraw(int amount) throws Exception {
		if (balance + creditLine < amount) {
			throw new Exception("인출이 불가능합니다.");
		}
		balance -= amount;
		return amount;
	}

}

*출력

package objectClass;
	
public class CreditLineAccountEx01 extends Account {
	public static void main(String[] args) {
		CreditLineAccount sunmin = new CreditLineAccount("111-22-55555","선민", 100, 2000000);
		try {
			int amount = sunmin.withdraw(500000);
			System.out.println("인출액 : " + amount);
			System.out.println("잔액 : " + sunmin.balance);
			System.out.println("마이너스 한도 : " + sunmin.creditLine);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	

}
