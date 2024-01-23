
	public static void main(String[] args) {
		int score = 80;
		score += 10;//score = score + 10;//복합대입 연산자 += -= *= /=
		System.out.println(score);
		int num = 50;
		int result = num;
		System.out.println(result);
	}

}



	public static void main(String[] args) {
		int num = 10;
		//++ -- 증감연산자// num = num + 1
		//++변수(전위 증가연산자) 변수++(후위증가연산자)
		//--변수(전위 감소연산자) 변수--(후위감소연산자)
		//System.out.println(num++);//후위에 있으면 값 프린트 후 증가 그러므로 개별로 사용
		++num;
		System.out.println(num);
		
	}

}
	public static void main(String[] args) {
		//비교연산자(>, >=, <, <=, ==, !=) 주로 조건문과 반복문에서 사용된다.
		int num1 = 20;
		int num2 = 10;
		System.out.println(num1>=num2);
		char ch1 = 'A';
		char ch2 = 65;
		System.out.println(ch1==ch2);
		
	}


	public static void main(String[] args) {
		//논리연산자(&&(AND) ||(OR) !(NOT))
		int num1 = 25;
		int num2 = 30;
		System.out.println(num1 >= 10 && num2 >= 10);
		char ch1 = 'f';
		if(ch1>=65 && ch1<=90) {//ch1>='A' && ch1<='Z'
			System.out.println("대문자이군요");
		}
		if(ch1>=97 && ch1<=122) {
			System.out.println("소문자이군요");
		}
		
	}
