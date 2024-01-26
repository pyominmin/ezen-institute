*update 메서드

  
	//신체정보 업데이트 클래스
  
public class PhysicalInfo {
	//멤버 변수
	String name;
	int age;
	float height, weight;
	
	//빈생성자
	public PhysicalInfo() {
		
	}
	
	//생성자
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//메서드
	public void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//매서드 오버로딩
	public void update(int age, float height) {//메서드 오버로딩(같은 이름을 가진 메서드를 여러개 만들 수 있다.)
		this.age = age;
		this.height = height;
	}
	
	//매서드 오버로딩
	public void update(int age) {//메서드 오버로딩(같은 이름을 가진 메서드를 여러개 만들 수 있다.)
		this.age = age;
	}
	
}

//출력
public class PhysicalInfo01 {

	// 신체정보를 출력하는 메서드
	public static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		PhysicalInfo min = new PhysicalInfo("민", 10, 130.5f, 33.5f);
		printPhysicalInfo(min);// 내 정보를 obj에게 넘겨준다.
		min.update(11, 140.0f, 45.0f);//업데이트 메서드
		printPhysicalInfo(min);
		min.update(12, 152.0f);//메서드를 오버로딩해서 몸무게를 추가하지 않아도 된다.
		printPhysicalInfo(min);
		min.update(13);//메서드 오버로딩해서 몸무게와 키를 추가하지 않아도된다.
		printPhysicalInfo(min);
	}

}
