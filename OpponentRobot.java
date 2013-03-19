import robocode.Robot;
import robocode.ScannedRobotEvent;


public class OpponentRobot {

	private double locationX;
	private double locationY;
	
	private ScannedRobotEvent robot;
	private Robot my;
	
	public OpponentRobot(ScannedRobotEvent e,Robot my) {
		this.robot = e;
		this.my    = my;
	}
	
	public void calculatePosition() {
		this.locationY = (Math.sin(this.my.getHeading()) * this.robot.getDistance()) + this.my.getY();
		this.locationX = (Math.cos(this.my.getHeading()) * this.robot.getDistance()) + this.my.getX();
	}

	public double getLocationX() {
		return locationX;
	}

	public void setLocationX(double locationX) {
		this.locationX = locationX;
	}

	public double getLocationY() {
		return locationY;
	}

	public void setLocationY(double locationY) {
		this.locationY = locationY;
	}
	
	

}
