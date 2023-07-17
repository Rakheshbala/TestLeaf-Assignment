 package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("pressBreakPedal");
	}
	public void applyGear() {
		System.out.println("changeGear");
	}
	public void switchOnAc() {
		System.out.println("switchOnHeadLamp");
	}
	public void applyAcclerate() {
		System.out.println("pressAccleratePedal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car fuction=new Car();
		fuction.applyBreak();
		fuction.applyGear();
		fuction.switchOnAc();
		fuction.applyAcclerate();

	}

}
