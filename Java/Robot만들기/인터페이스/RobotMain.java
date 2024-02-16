package com.lec.robot.v5_extends;

import com.lec.robot.v4_인터페이스.impl.FlyNo;
import com.lec.robot.v4_인터페이스.impl.FlyYes;
import com.lec.robot.v4_인터페이스.impl.MissileNo;
import com.lec.robot.v4_인터페이스.impl.MissileYes;
import com.lec.robot.v4_인터페이스.impl.SwordNo;
import com.lec.robot.v4_인터페이스.impl.SwordWood;
import com.lec.robot.v4_인터페이스.impl.울트라짱검;
import com.lec.robot.v4_인터페이스.impl.탄도미사일;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V5.0 (extends) === ");
		System.out.println();

		//중요
		Robot robot = null;
		
		//생산라인을 하나로 합치기 ver6
		robot = new CheapRobot("Cheap", 10);
		System.out.println(robot.getClass());
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new MissileNo());
		robot.actionMissile();
		robot.setSword(new SwordNo());
		robot.actionSword();
		System.out.println(robot.name + "Robot의 재고수량= " + robot.qty);
		
		
		robot = new StandardRobot("Standard", 10);
		System.out.println(robot.getClass());
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyYes());
		robot.actionFly();
		robot.setMissile(new 탄도미사일());
		robot.actionMissile();
		robot.setSword(new SwordWood());
		robot.actionSword();
		System.out.println(robot.name + "Robot의 재고 수량=" + robot.qty);
		
		
		robot = new SuperRobot("Super", 5);
		System.out.println(robot.getClass());
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyYes());
		robot.actionFly();
		robot.setMissile(new MissileYes());
		robot.actionMissile();
		robot.setSword(new 울트라짱검());
		robot.actionSword();
		System.out.println(robot.name + "Robot의 재고 수량=" + robot.qty);
		
	}

}
