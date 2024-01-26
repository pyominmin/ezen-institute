열거형 enums


  * 메서드 calender
package reference;

public enum Week {//열거형 객체는 상수이므로 대문자로 쓴다.
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATERDAY,
	SUNDAY
}



import java.util.Calendar;

public class EnumEX01 {

	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();//calender 메소드 
		System.out.println(cal.get(Calendar.YEAR));//YEAR라는 상수를 가져와서 출력한다.
		System.out.println(cal.get(Calendar.MONTH));//배열처럼 보관해서 1월에 0으로 찍힌다.
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//주를 숫자로 가져온다.//일요일 1, 월요일 2, 화요일 3, 수요일 4, 목요일 5, 금요일 6
		
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		switch(weekday) {//열거형 상수를 쓰는 이유는 DAY_OF_WEEK가 숫자로 되어있기 때문에 가독성을 위해 사용한다.
		case 1 :
			today = Week.SUNDAY;
			break;
		case 2 :
			today = Week.MONDAY;
			break;
		case 3 :
			today = Week.TUESDAY;
			break;
		case 4 :
			today = Week.WEDNESDAY;
			break;
		case 5 :
			today = Week.THURSDAY;
			break;
		case 6 :
			today = Week.FRIDAY;
			break;
		case 7 :
			today = Week.SATERDAY;
			break;
			
		}
		if(today == Week.SUNDAY) {
			System.out.println("일요일은 푹 쉽니다.");
		}else {
			System.out.println("열심히 자바공부를 합니다.");
		}
	}
