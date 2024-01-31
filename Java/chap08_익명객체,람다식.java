*익명객체
//클래스

public interface Calculable {
	void calculate (int x, int y);
}

//출력

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
