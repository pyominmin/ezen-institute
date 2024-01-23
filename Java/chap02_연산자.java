
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
