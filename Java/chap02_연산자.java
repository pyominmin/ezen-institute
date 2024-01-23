
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

public static void main(String[] args) {
		//삼항연산자
		int num1 = 70;
		int num2 = 30;
		//int result = (조건식)? 값 또는 수식 : 값 또는 수식;
		int result = (num1 > num2)? num1 : num2;
		System.out.println("두 수 중에 큰 값은 " + result + "입니다");
	}


	public static void main(String[] args) {
		System.out.print("상품의 가격을 입력하시오 : ");
		Scanner in = new Scanner(System.in);
		int price = in.nextInt();
		
		//방법1
//		int discount;
//		if(price >= 10000) {
//			discount = price - (price * 0.2);
//		}else {
//			discount = price - (price * 0.1);
//		}
		
		//방법2
//		double discountRate = price>=10000 ? 0.2 : 0.1;
//		double discount = price - (price * discountRate);
		
		//방법3
		double discount = price>=10000 ?(price * 0.8) : (price * 0.9);
		
		System.out.println("상품의 가격은"+ price + "원이고 할인율을 적용하여 "+ (int)discount +"원에 구입 가능합니다.");
	}

