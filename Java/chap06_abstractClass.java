*abstract//추상클래스

  *부모클래스
  
public abstract class Animal {// abstract는 추상클래스이다.
	String name;
	//추상클래스에는 추상메서드가 있어야 한다.
	//추상메서드는 오버라이딩 하기 위해 생성
	abstract void move();
}

*자식클래스1
  
public class Tiger extends Animal{
	int age;
	
	@Override
	void move() {
		System.out.println("네발로 이동합니다.");
		
	}
	

}

*자식클래스2

public class Eagle extends Animal{
	String home;
	
	@Override
	void move() {
		System.out.println("날개로 이동합니다.");
		
	}
	

}

*출력


public class AbstractEX01 {

	public static void main(String[] args) {
		Tiger hodol = new Tiger();//인스턴스 객체 생성
		Eagle eagle1 = new Eagle();
		
		hodol.name = "호돌이";
		hodol.age = 3;
		System.out.println(hodol.name + "는 " + hodol.age + "살 입니다.");
		hodol.move();
		
		eagle1.name = "독수리";
		eagle1.home = "소나무둥지";
		System.out.println(eagle1.name + "는 " + eagle1.home + "에서 삽니다.");
		eagle1.move();

	}

}

  
