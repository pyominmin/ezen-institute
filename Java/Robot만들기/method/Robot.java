package com.lec.robot.v6_method;

import com.lec.robot.v4_인터페이스.inter.InterFly;
import com.lec.robot.v4_인터페이스.inter.InterMissile;
import com.lec.robot.v4_인터페이스.inter.InterSword;

public class Robot {
	//필드
	public String name;
	public int qty;
	
	//필드
		private InterFly fly;
		private InterMissile missile;
		private InterSword sword;
		
		public Robot(String name, int qty) {
			super();
			this.name = name;
			this.qty = qty;
		}
			//일반메서드
			public void shape(){System.out.println(this.name + "Robot입니다! 팔, 다리, 머리, 몸통이 있습니다!");}
			public void actionWalk(){System.out.println("걸을 수가 있습니다!");}
			public void actionRun(){System.out.println("달릴 수가 있습니다!");}
			
			//setter
			public void setFly(InterFly fly) {
				this.fly = fly;
			}

			public void setMissile(InterMissile missile) {
				this.missile = missile;
			}

			public void setSword(InterSword sword) {
				this.sword = sword;
			}
			
			//추상화 재정의
			public void actionFly() {
				fly.Fly();
				
			}
			public void actionMissile() {
				missile.missile();
				
			}
			public void actionSword() {
				sword.Sword();
			}
		}
