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
