package com.lec.robot.v2_상속;

public class StandardRobot extends Robot{
//생성자
	public StandardRobot(String name, int qty) {
		//상속
		super(name, qty);
		
	}
	//메서드
	public void actionFly(){System.out.println("날 수가 있습니다!");}
	public void actionMissile(){System.out.println("미사일을 쏠 수 없습니다!");}
	public void actionSword(){System.out.println("목검이 있습니다!");}
}
