*익명객체
//클래스

@FunctionalInterface//람다식을 쓰겠다는 어노테이션
public interface Calculable {
	//추상메서드
	void calculate (int x, int y);
}
//sum class
public class Sum implements Calculable{

	@Override
	public void calculate(int x, int y) {
		System.out.println("두 수의 합 = " + (x + y));
		
	}

}
//빼기class

public class Subtract implements Calculable{

	@Override
	public void calculate(int x, int y) {
		System.out.println("두 수의 차 = " + (x - y));
		
	}

}

//출력1

public class CarculableEx01 {

	public static void main(String[] args) {
		Sum hap = new Sum(); //인스턴스 객체 생성
		hap.calculate(10, 23);
		
		Subtract cha = new Subtract(); //인스턴스 객체 생성
		cha.calculate(50, 42);
	}

}


//출력2

public class CalculableEx02 {

	public static void main(String[] args) {
		Calculable calcu;//선언
		calcu = new Calculable() {//익명클래스
			
			@Override//구현 클래스를 만든다.
			public void calculate(int x, int y) {
				System.out.println("두 수의 합 = " + (x+y));
				
			}
		};
		calcu.calculate(20, 45);
		
		calcu = new Calculable() {//익명클래스
			
			@Override//구현 클래스를 만든다.
			public void calculate(int x, int y) {
				System.out.println("두 수의 차 = " + (x-y));
				
			}
		};
		calcu.calculate(50, 30);
	}

}
----------------------------------------------------------------------------------------

*람다식
//추상메서드가 하나일 때만 사용가능

public class CalculableEx03 {

	public static void main(String[] args) {
		Calculable calcu;//선언
		//람다식
		calcu = (x,y) ->{
			System.out.println("두 수의 합 = " + (x+y));
		};
			
		calcu.calculate(20, 45);
		
		calcu = (x,y) ->{
				System.out.println("두 수의 차 = " + (x-y));				
			};
		calcu.calculate(50, 30);
	}

}

----------------------------------------------------------------------------------------

*람다식


import java.awt.Toolkit;

public class ThreadEx04 {

	public static void main(String[] args) {
		// 멀티쓰레드(Multi Thread)
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				Toolkit tool = Toolkit.getDefaultToolkit();
//				for (int i = 1; i <= 5; i++) {
//					tool.beep();
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {
//
//					}
//				}
//				
//			}
//		}).start();

		new Thread(() -> {
			Toolkit tool = Toolkit.getDefaultToolkit();
			for (int i = 1; i <= 5; i++) {
				tool.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {

				}
			}
		
		}).start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}

}
