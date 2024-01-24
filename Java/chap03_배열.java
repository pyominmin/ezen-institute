하나의 변수에 여러가지 값을 기억한다.

ublic static void main(String[] args) {
//		int score1 = 96;
//		int score2 = 73;
//		int score3 = 82;
//		int sum = score1 + score2 + score3;
//		double avg = sum / 3.0;
		
		int[] scores = new int[3];//하나의 변수에 여러개 값 기억
		scores[0] = 96;
		scores[1] = 73;
		scores[2] = 82;
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double avg = (double)sum / scores.length;
		
		System.out.println("총점= " + sum);
		System.out.println("평균= " + avg);

	}


//		int[] nums = new int[5]; //배열 선언
//		nums[0] = 45;
//		nums[1] = 90;
//		nums[2] = 23;
//		nums[3] = 42;
//		nums[4] = 77;

		int[] nums = {45, 90, 23, 42, 77}; //배열 선언과 초기화
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("총합=" + sum);
	}


int[] nums = {45, 90, 23, 42, 77, 96, 32, 43, 12, 15}; //배열 선언과 초기화
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				sum += nums[i];
			}
		}
		System.out.println("총합=" + sum);
	}



public static void main(String[] args) {
		System.out.println("**컴퓨터와 가위바위보 게임**");
		Scanner in = new Scanner(System.in);
		System.out.print("선택해주세요(1.바위 2.가위 3.보) : ");
		int my = in.nextInt();
		String[] choice = { "바위", "가위", "보" };
		int com = (int)(Math.random()*3)+1;
		
		if(com == my) {
			System.out.println("컴퓨터와 비겼습니다.");
		}else if((com == 1 && my == 3) || (com == 2 && my == 1) || (com == 3 && my == 2)) {
			System.out.println("당신이 이겼습니다.");
		}else {
			System.out.println("당신이 졌습니다.");
		}
		System.out.println("[컴퓨터] : " + choice[com-1] + "]★[나 : " + choice[my-1]+"]");
	}

