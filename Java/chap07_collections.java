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

*제네릭 - 타입을 정한 리스트 ex) <String>

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

		list.add("홍길동");
		list.add("김길동");
		list.add("이길동");
		list.add("박길동");
		list.add("백길동");
		list.add("손흥민");
		list.remove(2);
		list.set(0, "박찬호");
		String name = list.get(2);
		for(int i = 0; i < list.size();i++) {
			System.out.println(list.get(i));
		}


-----------------------------------------------------------------------------------

*set

import java.util.HashSet;
import java.util.Set;

public class HashSetEx01 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//중복을 허용하지 않는다.//순서를 유지하지 않는다.
		set.add("홍길동");
		set.add("김철수");
		set.add("이영희");
		System.out.println("총 인원수 :" + set.size());
		
		for(String name : set) {
			System.out.println("이름 " + name);
		}
		
		set.remove("김철수");
		System.out.println("**제거 후 출력**");
		
		for(String name : set) {
			System.out.println("이름 " + name);
		}
	}

}

-----------------------------------------------------------------------------------

*Iterator
//set은 iterator 사용가능

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();//중복을 허용하지 않는다.//순서를 유지하지 않는다.
		set.add("홍길동");
		set.add("김철수");
		set.add("이영희");
		System.out.println("총 인원수 :" + set.size());
		
		for(String name : set) {
			System.out.println("이름 " + name);
		}
		
		set.remove("김철수");
		System.out.println("**제거 후 출력**");
		
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println("이름 : " + name);
		}
	}
}

-----------------------------------------------------------------------------------

*Hashmap

import java.util.HashMap;
import java.util.Map;

public class HashMapEx01 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "홍길동");
		map.put(2, "김철수");
		map.put(3, "이영희");
		map.put(4, "박찬호");
		System.out.println("총 인원수 : " + map.size());
		System.out.println(map.get(3)); //key를 가지고 값을 이끌어낸다.
		

	}

}
	

	Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 75);
		map.put("김철수", 90);
		map.put("이영희", 96);
		map.put("박찬호", 85);
		map.put("손흥민", 80);
		
		System.out.println(map.get("이영희"));
