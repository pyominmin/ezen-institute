반복문(for, while, do-while)

  public static void main(String[] args) {
		System.out.println("컴퓨터가 인사를 시작합니다.");
		for(int i = 1; i <= 5; i++) {
			System.out.println("안녕하세요" + i);
		}
		System.out.println("끝~");
	}

public static void main(String[] args) {
		System.out.println("**토큰 가격표**");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "개 가격=" + i * 370);
		}
	}

public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : ");
		int num = in.nextInt();
		System.out.println("**" + num + "단**");
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = "+ num*i);
		}
	}



	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}else{
				oddSum += i;
			}
		}
		System.out.println("1부터 100까지의 짝수의 합 = " + evenSum);
		System.out.println("1부터 100까지의 홀수의 합 = " + oddSum);
	}

public static void main(String[] args) {
		int i;
		int num = 0;
		
		for(i = 1; i <= 100; i++) {
			num += i;
			if(num >= 3500) {
				break;
			}
		}
		System.out.println(i);
	}


public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;//반복문의 처을으로 빠져나간다.
			}
			sum +=i;
		}
		System.out.println("1부터 100까지 짝수의 합=" + sum);
	}


public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println("**" + i + "단**");
			System.out.println();
			for(int j = 1; j <= 9; j++) {
				System.out.println(i +" x " + j + " = " + i*j);
			}
			System.out.println();
		}
	}
