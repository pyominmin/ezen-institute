
	public static void main(String[] args) {
		System.out.println("점수를 입력해주세요 : ");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();
		if(score>=80) {
			System.out.println("합격을 축하드립니다.");
		}
		System.out.println("수고하셨습니다.");

	}

	public static void main(String[] args) {
		System.out.print("구입할 수량을 입력해주세요 : ");
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		int price = 5000;
		String memo = "(정상가)";
		
		if(amount >= 10) {
			 price *= 0.8;// (int)(price*0.8);
			 memo = "(할인가)";
		}
		int pay = amount * price;
		System.out.println("구입 금액은 " + pay + "입니다." + memo);
	}

public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("구입할 수량을 입력하세요: ");
		int amount = in.nextInt();
		System.out.print("단가를 입력하세요: ");
		int price = in.nextInt();
		
		if(amount >= 10 && price >= 1000) {
			price *= 0.8;
		}
		
		int salesPrice = amount*price;
		System.out.println("구입 금액= " + salesPrice);
	}



	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = in.nextInt();
		if(score >= 80) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		System.out.println("수고하셨습니다.");
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score = in.nextInt();
		
		if(score>=90 && score<=100) {
			System.out.println("A학점");
		}else if(score>=80 && score<=89) {
			System.out.println("B학점");
		}else if(score>=70 && score<=79) {
			System.out.println("C학점");
		}else if(score>=60 && score<=69) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
	}
