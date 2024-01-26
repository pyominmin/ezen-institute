*싱글톤

//싱글톤은 인스턴스 객체를 생성하지 못한다.

//클래스
package objectClass;
	
public class Singleton {
	//싱글톤은 ex) 
	//정적필드 선언과 초기화
	private static Singleton sington = new Singleton();
	
	//빈 생성자
	private Singleton() {
		
	}
	
	//메서드
	static Singleton getInstance() {
		return sington;
  }
	
}

//출력


package objectClass;
	
public class SingletonEx01 {

	public static void main(String[] args) {
		//Singleton sing1 = new Singleton(); 인스턴스 객체는 생성할 수 없음
		//Singleton sing2 = new Singleton();
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		if(sing1 == sing2) {//하나의 객체이다.
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
	}
}


*청섬대 예시(청섬대는 단 하나있다.)

//클래스
package objectClass;
	
public class Cheomseongdae {
	//정적필드
	private static Cheomseongdae cheom = new Cheomseongdae();
	
	//생성자
	private Cheomseongdae() {
		
	}
	
	//메서드
	public static Cheomseongdae getInstance() {
		return Cheomseongdae.cheom;
	}
	
	//천문관측 메서드
	public static void show(String name) {
		System.out.println(name + "(가)이 천문을 관측합니다.");
	}
	
}

//출력

package objectClass;
	
public class CheomseongdaeEX01 {
	
	public static void main(String[] args) {
		Cheomseongdae min = Cheomseongdae.getInstance();//표를 끊고 첨성대를 방문했다.
		Cheomseongdae sunmin = Cheomseongdae.getInstance();//표를 끊고 첨성대를 방문했다.
		
		//둘이 같은 첨성대에 가서 관람했다.
		min.show("민");
		sunmin.show("선민");
		//다른 객체가 같은 곳을 들어가는게 싱글톤이다.
		
		if(min == sunmin) {
			System.out.println("같은 객체(첨성대) 입니다.");
		}else {
			System.out.println("다른 객체(첨성대) 입니다.");
		}
	}
}
