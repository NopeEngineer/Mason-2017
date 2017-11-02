package org.usfirst.frc.team2509.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final String init = null;
	public static RobotDrive DriveTrain;
	public static CANTalon DT_RIGHTFRONT =new CANTalon(1);
	public static CANTalon DT_LEFTFRONT =new CANTalon(2);
	public static CANTalon DT_RIGHTREAR =new CANTalon(3);
	public static CANTalon DT_LEFTREAR = new CANTalon(0);
	{	
}
	
	public static void init() {
		DT_LEFTREAR = new CANTalon(0);
		DT_RIGHTFRONT = new CANTalon(1);
		DT_LEFTFRONT = new CANTalon(2);
		DT_RIGHTREAR = new CANTalon(3);
		
		DriveTrain = new RobotDrive(DT_LEFTFRONT, DT_LEFTREAR,DT_RIGHTFRONT, DT_RIGHTREAR);
        DriveTrain.setSafetyEnabled(false);
        DriveTrain.setExpiration(1.0);
        DriveTrain.setSensitivity(1.0);
        DriveTrain.setMaxOutput(1.0);
        DriveTrain.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        DriveTrain.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		
		
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	}
}