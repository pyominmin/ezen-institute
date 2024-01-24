반복문(for, while, do-while)
*for문
	
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


	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 6-i; j++) {//for(int j = i; j <= 5; j++)
				System.out.print("*");	
			}
			
			System.out.println();
		}
	}




	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
			for (int b = 15; b >= i; b--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}
               *
              ***
             *****
            *******
           *********
          ***********
         *************
        ***************
       *****************
      *******************
     *********************
    ***********************
   *************************
  ***************************
 *****************************




public static void main(String[] args) {
		int sum; // 전체 보물 무게(30kg)

		for (int i = 1; i <= 30; i++) {// 2kg 보물 개수
			for (int k = 1; k <= 30; k++) {// 3kg 보물 개수
				sum = i * 2 + k * 3;
				if (sum == 30) {
					System.out.println("2kg 보물 수 =" + i + ", 3kg 보물 수=" + k);
				}
			}

		}
	}


	public static void main(String[] args) {
		exit:for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.println(i + "---" + j);
				if(i == 3) {
					break exit;//반복문을 탈출할 수 있게 도와줌
				}
			}
		}
	}


*while문//데이터베이스에서 많이 활용

public static void main(String[] args) {
		int sum=0;
		int i = 1;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.println("1부터 100까지의 합= "+ sum);
	}



public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean run = true;
		while(true) {//무한반복문
			++num;
			System.out.println("안녕하세요" + num);
			if(num==1560) {
				run = false;//또는 break;
			}
		}
	}


public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		boolean run = true;
		while (run) {
			System.out.print("로또 자동번호를 생성하려면 c를 입력, 그만하시려면 q를 입력 : ");
			String choice = in.nextLine();
			if (choice.equals("c")) {
				for (int i = 1; i <= 6; i++) {
					num = (int) (Math.random() * 45) + 1;
					System.out.println(i + "번째 숫자 : " + num);
				}
			}else if(choice.equals("q")) {
				break;//run = false;
			}else {
				System.out.println("입력 오류 다시 입력하세요");
			}

		}
		System.out.println("**프로그램 종료**");
	}

*do while

public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do{
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("1부터 100까지의 합 = " + sum);
	}
