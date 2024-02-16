package com.lec.robot.v3_추상화;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V3.0 (상속) === ");
		System.out.println();
		
		CheapRobot cheapRobot = new CheapRobot("Cheap", 10);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name + "Robot의 재고 수량" + cheapRobot.qty);
		
		StandardRobot standardRobot = new StandardRobot("Standard", 10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println(standardRobot.name + "Robot의 재고수량 = " + standardRobot.qty);
		
		SuperRobot superRobot = new SuperRobot("Super", 10);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println(superRobot.name + "Robot의 재고수량 = " + superRobot.qty);
	}

}
