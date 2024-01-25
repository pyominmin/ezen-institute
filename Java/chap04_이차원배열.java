public static void main(String[] args) {
		int[][] nums = new int[3][5];//행, 열
		nums[0][0] = 10;
		nums[1][1] = 30;
		nums[2][3] = 70;
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
	}

*반 학생들의 총점
public static void main(String[] args) {
		int[][] num = {{78, 96, 80, 66, 74},{50, 90, 80}};
		int sum;
		double avg;
		for(int i = 0; i < num.length; i++) {
			sum = 0;
			avg = 0.0;
			for(int j = 0; j < num[i].length; j++) {
				sum += num[i][j];
			}
			avg = (double) sum/num[i].length;
			System.out.println((i+1) + "반 학생들의 총점= " + sum);
			System.out.println((i+1) + "반 학생들의 평균= " + avg);
		}
	}

