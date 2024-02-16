package com.lec.ex01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;



public class HashMapMain {

	public static void main(String[] args) {
		//1. Map객체생성
		//맵은 앞이 키, 뒤가 value
		//원칙적으로 key값은 중복되면 안된다.
		//keySet공부하기 
		Map<String, Integer>map = new HashMap<>();
		map.put("홍길동", 100);
		map.put("홍길동", 90);
		System.out.println(map.size());
		System.out.println(map.get("홍길동"));
		
		Map<Student, Integer> students = new HashMap<>();
		students.put(new Student(1, "소향"), 100);
		students.put(new Student(1, "소향"), 99);
		students.put(new Student(2, "소향"), 99);
		System.out.println(students.size());
		
		Set<Student> KeySet = students.keySet();
		Iterator<Student> xxx = KeySet.iterator();
		while(xxx.hasNext()) {
			Student student = xxx.next();
			Integer score = students.get(student);
			System.out.println(student + "의 점수  = " +  score);
		}
	}

}

class Student{
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	@Override
	public int hashCode() {//중복검사
		return Objects.hash(name, sno);
	}

	@Override
	public boolean equals(Object obj) {//중복검사//재정의를 해야한다.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && sno == other.sno;
	}



	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	
	
}
