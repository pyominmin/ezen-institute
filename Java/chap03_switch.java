
	public static void main(String[] args) {
		System.out.print("여행지를 선택해주세요(1.미주 2. 유럽 3. 동남아) : ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			System.out.println("1층 안내데스크로 가세요");
			break;
		case 2:
			System.out.println("2층 안내데스크로 가세요");
			break;
		case 3:
			System.out.println("3층 안내데스크로 가세요");
			break;
		default:
			System.out.println("여행지 선택이 잘못되었습니다.");
		}

	}

public static void main(String[] args) {
		char grade = 'b';
		switch (grade) {
		case 'a':
		case 'A':
			System.out.println("우수회원입니다.");
			break;
		case 'b':
		case 'B':
			System.out.println("일반회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}

	}

굳이 아래처럼 할 필요가 없다.
	public static void main(String[] args) {
		System.out.print("점수를 입력해주세요 : ");
		Scanner in = new Scanner(System.in);
		int score = in.nextInt();

		if (score <= 100 && score >= 0) {
			switch (score / 10) {
			case 10:
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			}
		} else {
			System.out.println("점수를 잘못 입력했습니다.");
		}
  }
