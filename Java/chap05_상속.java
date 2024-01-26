*상속 클래스를 만들 때
class 상속객체 extends 자식객체

*부모 클래스
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
			System.out.println("잔액이 부족합니다.");
		}
		balance -= amount;
		return amount;
	}
	
	
}

*자식클래스
package objectClass;
	//체크카드 클래스
	public class CheckingAccount extends Account {// Account 클래스를 상속 받았다.
		// 필드(멤버변수)
		String cardNo;// 카드번호

		// 생성자
		public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
			super(accountNo, ownerName, balance);// 부모생성자 호출한다
			this.cardNo = cardNo;
		}

		// 빈 생성자
		public CheckingAccount() {

		}

		// 메서드(카드로 지불한다)
		int pay(String cardNo, int amount) throws Exception {
			if (!cardNo.equals(this.cardNo) || balance < amount) {
				throw new Exception("지불이 불가능 합니다.");
			}
			return withdraw(amount);//상속메서드
		}

	}

*출력
package objectClass;
	
public class CheckingAccountEx01 {
	
	public static void main(String[] args) {
		
		CheckingAccount min = new CheckingAccount("111-22-33333", "표민", 100, "1111-2222-3333-4444");
		min.deposit(5000);
		try {
			int paidAmount = min.pay("1111-2222-3333-4444", 1000);
			System.out.println("지불액은 : " + paidAmount);
			System.out.println("잔액은 : " + min.balance);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
