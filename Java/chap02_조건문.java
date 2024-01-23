
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
