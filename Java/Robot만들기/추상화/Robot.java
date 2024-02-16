package com.lec.robot.v3_추상화;

public abstract class Robot {
	//변수
		public String name;
		public int qty;
		//생성자
		public Robot(String name, int qty) {
			this.name = name;
			this.qty = qty;
		}
		//메서드
		public void shape(){System.out.println(this.name + "Robot입니다! 팔, 다리, 머리, 몸통이 있습니다!");}
		public void actionWalk(){System.out.println("걸을 수가 있습니다!");}
		public void actionRun(){System.out.println("달릴 수가 있습니다!");}
		
		//추상메서드가 있으면 추상 클래스여야 한다.
		//actionFly, actionMissile, actionSword
		public abstract void actionFly();
		public abstract void actionMissile();
		public abstract void actionSword();
		
}
