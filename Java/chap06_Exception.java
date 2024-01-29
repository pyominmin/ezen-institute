*예외처리

1)
public class ExceptionEx01 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		try {//예외처리
		int result = num1 / num2;
		System.out.println("연산결과 = " + result);
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}

}

2)



public class ExceptionEx02 {

	public static void main(String[] args) {
		String[] str = { "100", "200", "150" };
		int sum = 0;
		try {
			for (int i = 0; i < str.length; i++) {
				int value = Integer.parseInt(str[i]);
				sum += value;
			}
			System.out.println("총합 = " + sum);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스가 초과했습니다.");
		}catch (NumberFormatException e) {
			System.out.println("문자 데이터는 수치로 변환할 수 없습니다.");
		}catch(Exception e) {
			System.out.println("예외발생(개발자에게 문의하세요))" + e.getMessage());
		}finally {
			System.out.println("무조건 실행");
		}

	}

}

3) 인위 exception class

public class InsufficientException extends Exception{
	//빈생성자
	public InsufficientException() {
		
	}
	
	//문자 메시지를 받는 생성자
	public InsufficientException(String message) {
		super(message);
		
	}
	
}
-----------------------------------------------------------------
*인위적으로 exception 주기
	
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
	public int withdraw(int amount) throws InsufficientException{
		if(balance < amount) {
			throw new InsufficientException("잔고 부족(" + (amount - balance) + "모자람) : 인출이 불가능합니다.");
		}
		balance -= amount;
		return amount;
	}
	
	
}

--------------------------------------------------------------------------------------------
*출력

public class AccountEx01 {

	public static void main(String[] args) {
		Account min = new Account("111-22-33333", "민", 100);
		min.deposit(5000);
		try {
			int amount = min.withdraw(30000);
			System.out.println("인출금액 : " + amount);
			System.out.println("잔액 : " + min.balance);
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());

		}

	}

}
