
public class VariableEx01 {

	public static void main(String[] args) {
		System.out.println("안녕하세요"); //안녕하세요 문자가 콘솔로 출력
		System.out.println(20);
		System.out.println(50+30);//숫자를 사용하면 산술연산
		System.out.println("대한민국"+"화이팅");//문자를 사용하면 연결연산
		
	}

}


import java.util.Scanner;

public class VariableEx02 {

	public static void main(String[] args) {
		//상수> 숫자 상수, 문자 상수
		//변수 : 단 하나의 값을 저장할 수 있는 메모리 공간// _과 $는 변수로 사용가능
		//변수 > 숫자 변수, 문자변수
		//		int korea;//변수의 선언
		//korea = 20;//초기화
		//변수의 종류 int, String 등
//		int korea = 20; //변수의 선언과 초기화
//		korea=50;
//		System.out.println(korea);
		Scanner in=new Scanner(System.in);
		int score = in.nextInt();
		System.out.println("시험점수=" + score);
		if(score>=80) {
			System.out.println("합격하셨숩니다.");
		}else {
			System.out.println("다음에 도전해주세요");
		}
		
	}

}


public class VariableEX03 {

	public static void main(String[] args) {
		int x=10;
		int y=2;
		System.out.println("x+y="+(x+y));
		System.out.println("x-y="+(x-y));
		System.out.println("x*y="+(x*y));
		System.out.println("x/y="+(x/y));

	}

}



public class VariableEx04 {

	public static void main(String[] args) {
//		System.out.println("안녕"+"철수");
//		System.out.println("점수="+86+10);//연결연산
//		System.out.println("점수="+(86+10));//괄호를 사용하여 우선연산
//		System.out.println(50+30+15);
		
		int x=10;
		int y=20;
		int num = x;
		
		x=y;
		y = num;//소트알고리즘
		
		System.out.println("x값=" + x);
		System.out.println("y값=" + y);
		
	}

}


import java.util.Scanner;

public class VariableEX05 {

	public static void main(String[] args) {
		System.out.print("원하는 시간을 입력하시오>>");
		Scanner in = new Scanner(System.in);
		int hour=in.nextInt();
		
		int min = hour*60;
		
		System.out.println(hour+"시간은 총 "+ min+ "분 입니다" );
		
	}

}


import java.util.Scanner;

public class VariableEX06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("총 걸린 시간을 분으로 입력하시오 : ");
		int hour = in.nextInt();
		
		int allmin = hour%60;
		int allhour = hour/60;
		System.out.println("총 걸린 시간은 " + allhour+"시간 "+ allmin+ "분입니다.");
	}

}


import java.util.Scanner;

public class VariableEX07 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		int money= in.nextInt();
		int tenT = money/10000;//전체 금액을 만으로 나눠서 몫
		money=money%10000;//전체 금액에서 만원권을 제외한 나머지(%)
		int fiveT = money/5000;//만원권을 제외한 나머지 금액에서 오천원 개수
		money=money%5000;//나머지 금액에서 오천원권을 제외한 나머지(%)
		int oneT = money/1000;
		money=money%1000;
		int fiveH = money/500;
		money=money%500;
		int oneH = money/100;
		money=money%100;
		int ten = money/10;
		
		System.out.println("만원권=" + tenT+"장");
		System.out.println("오천원권=" +fiveT+"장");
		System.out.println("천원권= " + oneT+"장");
		System.out.println("오백원= " + fiveH+"개");
		System.out.println("백원= "+ oneH+"개");
		System.out.println("십원= "+ ten+"개");
		
		
		
	}

}


public class VariableEX08 {

	public static void main(String[] args) {
		int num1=20;
		int num2=0b1110;//0b는 2진수로 계산한다는 뜻
		int num3=026;//0만 붙이면 8진수로 인식
		int num4=0x2A7;//0x는 16진수 표현방식
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);

	}

}



public class VariableEX09 {

	public static void main(String[] args) {
		//변수의 타입 변수 이름;
		//변수의 타입 변수이름=초기값;
		
		//정수 :byte(1), short(2), int(4), long(8)큰숫자 뒤에 L을 붙여서 Long데이터에 담으라고 한다. 
		long num1=2147483648L;
		System.out.println(num1);
		
		//실수 :(부동소수점수)float(4), double(8)
		double num2=5.0/2.0;
		System.out.println(num2);
		
		float num3=45.23f;//f를 붙여야 출력됨
		System.out.println(num3);
		
		double num4=2E5;//2*10^5 지수 표현하는 것
		System.out.println(num4);
		
		double num5=2E-5;//2*10^-5
		System.out.println(num5);
		
		float num6=0.12345678912345f;//반올림됨
		System.out.println(num6);

	}

}

public class VariableEX10 {

	public static void main(String[] args) {
		//문자형 : char(2)
		char ch1 ='A';
		System.out.println(ch1);
		
		char ch2 = 65;
		System.out.println(ch2);
		
		char ch3 = '가';
		System.out.println(ch3);
		
		char ch4 = 44032;//유니코드값표
		System.out.println(ch4);
		
		char ch5 = 0xAC00;
		System.out.println(ch5);
		
		char ch6 = '\uAC00';
		System.out.println(ch6);

	}

}
