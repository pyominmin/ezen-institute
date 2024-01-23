

	public static void main(String[] args) {
		boolean power = true;
		System.out.println(power);
		int num = 50;
		System.out.println(num);
		System.out.println(5>2);//논리연산자는 boolean 값으로 나온다.
		char ch1='A';
		System.out.println(ch1);
		String str = "Korea";//String 객체는 korea를 담을 수 있는 메모리 주소를 관리한다.
		System.out.println(str);
		String str2 = "안녕하세요\n자바를 배우고 있습니다.";//영문 글꼴일 때 \로 보인다.// \n 줄바꿈
		System.out.println(str2);
		String str3="국어\t영어\t수학";// \t 탭키 역할
		System.out.println(str3);
		String str4 = "철수가 말했다.\"안녕\"이라고";// \"\"따옴표 출력
		System.out.println(str4);

	}

}

	public static void main(String[] args) {
		int value = 50;
		byte bValue = (byte)value;//형변환(casting)
		System.out.println(bValue);
		
		double dValue = 45.36;
		int num = (int)dValue;
		System.out.println(num);
		
		byte x=10;
		byte y=20;
		int result= x + y;
		System.out.println(result);
		
	}

}


	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20";
		System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));//형변환되어서 산술연산됨
		
		int num = 10;
		System.out.println(String.valueOf(num));//정수를 문자로 변환
		String name = "김철수";
		int age = 25;
		System.out.println("내 이름은 " + name + "이고 나이는 " + age + "세입니다.");
		System.out.printf("내 이름은 %s이고 나이는 %d세입니다", name, age);

	}

}
