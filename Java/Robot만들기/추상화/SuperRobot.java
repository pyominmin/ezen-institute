package com.lec.robot.v3_추상화;

public class SuperRobot extends Robot{

	public SuperRobot(String name, int qty) {
		super(name, qty);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {
		System.out.println("날 수가 있습니다.");
		
	}

	@Override
	public void actionMissile() {
		System.out.println("미사일을 쏠 수가 있습니다!");
		
	}

	@Override
	public void actionSword() {
		System.out.println("광선검이 있습니다!");
		
	}

}
