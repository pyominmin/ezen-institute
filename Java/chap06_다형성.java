*다형성 (Polymorphism)

  //타이어 클래스
public class Tire {
	
	//메서드
	public void roll() {
		System.out.println("타이어가 회전합니다.");
	}
}
---------------------------------------------------------------------
//자동차 클래스
public class Car {
	//필드
	public Tire tire;//클래스를 필드로 사용한다.
	
	//메서드
	public void run() {
		tire.roll();
	}
}
---------------------------------------------------------------------
  //클래스
public class HankookTire extends Tire{

	//메서드
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
}
---------------------------------------------------------------------
  //클래스
public class KumhoTire extends Tire{
	//메서드
	@Override
	public void roll() {
		System.out.println("금호 타이어가 회전합니다.");
	}
}

---------------------------------------------------------------------
  *출력
  //다형성
public class PolymorphismEX01 {

	public static void main(String[] args) {
		//CheckingAccount chulsu = new CheckingAccount();
		//다형성은 상속과 깊은 관계가 있다.
		//**메서드의 다형성
		Account chulsu = new CreditLineAccount();//오버라이드된 메서드를 사용한다.
		//chulsu.withdraw(0);//다형성에 의해서 오버라이드된 withdraw이다.
		
		
		//**필드의 다형성
		Car myCar = new Car();//myCar 인스턴스 객체 생성
		myCar.tire = new Tire();//타이어객체를 생성해서 myCar라는 인스턴스 객체에 장착
		myCar.run();//메서드 수행
		
		//생성된 HankookTire 객체를 myCar 인스턴스 객체에 장착
		myCar.tire = new HankookTire();
		myCar.run();
		myCar.tire = new KumhoTire();
		myCar.run();

	}

}
