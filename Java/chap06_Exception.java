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

