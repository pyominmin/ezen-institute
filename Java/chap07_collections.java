//colection - 다양한 것들을 저장//동적배열(크기가 정해져있지 않다.)
배열 = length를 사용한다.
컬랙션 =add, size, get을 사용한다.

colection framework에는 3가지가 있다. list(arraylist), set, map


*ArrayList

  
import java.util.ArrayList;
import java.util.List;

public class GenericEx01 {

	public static void main(String[] args) {
//		int[] nums = new int[3];
//		nums[0] = 10;
//		nums[1] = 26;
//		nums[2] =  8;
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println("배열 [" + i + "] = " + nums[i]);
//			
//		}

		//동적 배열//숫자, 문자열, 실수 등 다양한 값을 넣을 수 있다.
		List list = new ArrayList();
		list.add(10);
		list.add("홍길동");
		list.add(56.12);
		list.add(false);
		list.add(20);
		
		String name = (String) list.get(1);
		int num = (int) list.get(0);
		for(int i = 0; i < list.size(); i++) {
			System.out.println("리스트값 = " + list.get(i));
		}
	}

}
-----------------------------------------------------------------------------------

*제네릭 - 타입을 정한 리스트

		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		list.add("박길동");
		list.add("백길동");
		list.add("손흥민");
		list.remove(2);
		String name = list.get(2);
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}

-----------------------------------------------------------------------------------

*LinkedList
  List<String> list2 = new LinkedList<String>();



  
