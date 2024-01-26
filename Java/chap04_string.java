*String은 참조다(주소가 들어있다)
  
public static void main(String[] args) {
		int num = 20; //int 기본타입
		String str = "korea"; // str은 참조타입(변수에 값이 아니라 주소가 들어있다.) 변수
		
	}

*메서드 equals

String str1 = "홍길동";
		String str2 = "홍길동";
		if(str1 == str2) {
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 문자열이 같음");
		}else {
			System.out.println("str1과 str2는 문자열이 다름");
		}
		
		String str3 = new String("김철수");//new는 새롭게 생성하는 것
		String str4 = new String("김철수");
		if(str3==str4) {
			System.out.println("str1과 str2는 참조가 같음");
		}else {
			System.out.println("str1과 str2는 참조가 다름");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3과 str4는 문자열이 같음");
		}else {
			System.out.println("str3과 str4는 문자열이 다름");
		}
	}




*메서드 charAt(0)
1.
public static void main(String[] args) {
//		String title = new String("우리모두 파이팅");//새로 메모리 만들기
//		char ch = title.charAt(3);//3번째 문자 가져오기
//		System.out.println(ch);
		String ssn = "971012-2234567";
		char sex = ssn.charAt(7);
		
		if(sex == '1' || sex == '3') {
			System.out.println("남자입니다.");
		}else if(sex == '2' || sex == '4') {
			System.out.println("여자입니다.");
		}else {
			System.out.println("잘못된 주민번호입니다.");
		}
	}


2.
	public static void main(String[] args) {
		String ssn = "9710122123456";
		System.out.println("총 글자수 = " + ssn.length());
		int len = ssn.length();
		if(len == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}

}

*메서드 replace, substring


public static void main(String[] args) {
		String str = "우리나라 화이팅";
		String newStr = str.replace("우리나라", "대한민국"); //앞의 글자를 뒤에 글자로 바꿔준다.
		System.out.println(str);
		System.out.println(newStr);//대한민국 화이팅
		String str2 = "computer";
		System.out.println(str.substring(5));//일부 문자열만 가져올 수 있다.//substring(5) 5번째 이후 문자부터 끝까지 가져온다.
		System.out.println(str2.substring(3,6));//3번째 이후와 6번째 이전 글자를 가져온다.
		String ssn = "971012-2234567";
		System.out.println("주민번호 : " + ssn.substring(0,7) + "*******");
	}


*메서드 indexOf, lastIndexOf


public static void main(String[] args) {
		String str = "프로그램언어 자바를 매일 8시간씩 배우고 있다.";
		int location = str.indexOf("파이썬");//앞에서 부터글자의 위치값을 알려준다.//글자를 못찾으면 -1
		System.out.println(location);
		String str2 = "자바의 정석은 자바의 기초부터 활용까지 자바를 정복할 수 있다.";
		int location2 = str2.lastIndexOf("자바");//뒤에서부터 글자를 찾는다. 하지만 세는건 앞에서부터
		System.out.println(location2);
		
	}


*메서드 contains

public static void main(String[] args) {
		String book = "자바의 정석";
		int location = book.indexOf("자바");//문자의 위치 값을 찾아줌
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련없는 책이군요");
		}
		 boolean result = book.contains("자바");//참 거짓의 boolean값으로 돌려줌
		 if(result) {
			 System.out.println("자바와 관련된 책이군요");
		 }else {
			 System.out.println("자바와 관련없는 책이군요");
		 }
	}


*메서드 split
split - 분리해준다.
	
public static void main(String[] args) {
		String str = "김철수,이영희,홍길동,박찬호,손흥민";
		String[] names = str.split(",");// ,은 구분자이므로 배열에 추가되지 않는다.//구분자는 공간을 분리한다.
		System.out.println("**합격자 명단**");
		for(int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + "번 : " + names[i]);
		}
	}
결과
**합격자 명단**
1번 : 김철수
2번 : 이영희
3번 : 홍길동
4번 : 박찬호
5번 : 손흥민

