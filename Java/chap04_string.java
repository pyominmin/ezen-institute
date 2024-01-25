*String은 참조다(주소가 들어있다)
  
public static void main(String[] args) {
		int num = 20; //int 기본타입
		String str = "korea"; // str은 참조타입(변수에 값이 아니라 주소가 들어있다.) 변수
		
	}

*함수 equals

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




