배열

//정렬(sort) : 무질서한 자료를 원하는 순서대로 재배열 하는 것
		//오름차순 정렬(ascending sort) : 작은것 => 큰순
		//내림차순 정렬(descending sort) : 큰것 => 작은 순
		int[] nums = {50, 23, 4, 82, 66};
		//sort 전 자료 출력
		System.out.println("**sort 전 자료 출력**");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		//sort 알고리즘
		int temp = 0;
		for(int i = 0; i < nums.length - 1; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		//sort 후 자료 출력
		System.out.println("\n**sort 후 자료 출력**");
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

*로또 자동번호 생성하기

	public static void main(String[] args) {
		int[] lotto = new int[6];//로또 자동번호 생성기
		boolean run = true;
		while (run) {
			// 번호 6개를 무작위로 생성
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
			}
			run = false;
			// 중복값 검증 알고리즘
			
			for (int i = 0; i < lotto.length - 1; i++) {
				for (int j = i + 1; j < lotto.length; j++) {
					if(lotto[i] == lotto[j]) {
						run = true;
						break;
					}
				}
			}
		}

		System.out.println("**로또 자동번호 출력**");
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번째 번호 : " + lotto[i]);
		}
	}

