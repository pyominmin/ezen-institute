
*캡슐화
//클래스
package objectClass;
	
public class Rectangle {
	
	//접근제어자를 둔 멤버변수
	private int width; //넓이
	private int height;//높이
	
	//생성자
	public Rectangle(int width, int height) throws Exception {//음수나 0이 나오면 안되기 때문에 예외처리를 해줘야 함 
		if(width <= 0 || height <= 0) {
			throw new Exception("넓이와 높이는 플러스 값이여야 합니다.");
		}
		this.width = width;
		this.height = height;
	}
	
	//면적 메서드
	int getArea() {
		return width * height;
	}

	//getter - 값을 보여주는 용도
	//setter - 값을 변경해주는 용도
	public int getWidth() {//getter는 캡슐화된 값을 리턴해줌
		return width;
	}

	public int getHeight() {//getter는 캡슐화된 값을 리턴해줌
		return height;
	}
	
	
}

//출력

package objectClass;
	
public class RectangleEx01 {
	
	public static void main(String[] args) {
		try {
			Rectangle rect1 = new Rectangle(20, -30);
			int area = rect1.getArea();
			System.out.println("사각형의 넓이 = " + rect1.getWidth());
			System.out.println("사각형의 높이 = " + rect1.getHeight());
			System.out.println("사각형의 면적 = " + area);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
