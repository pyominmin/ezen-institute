package com.lec.robot.v4_인터페이스;

import com.lec.robot.v4_인터페이스.inter.InterFly;
import com.lec.robot.v4_인터페이스.inter.InterMissile;
import com.lec.robot.v4_인터페이스.inter.InterSword;

public class SuperRobot extends Robot{
	InterFly fly;
	InterMissile missile;
	InterSword sword;

	public SuperRobot(String name, int qty) {
		super(name, qty);
	}

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
			@Override
			public void actionFly() {
				fly.Fly();
				
			}

			@Override
			public void actionMissile() {
				missile.missile();
				
			}

			@Override
			public void actionSword() {
				sword.Sword();
				
			}

	}
