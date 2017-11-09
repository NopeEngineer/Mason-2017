package org.usfirst.frc.team2509.robot;

import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static final String init = null;
	public static RobotDrive DriveTrain;
	public static CANTalon DT_RIGHTFRONT;
	public static CANTalon DT_LEFTFRONT;
	public static CANTalon DT_RIGHTREAR;
	public static CANTalon DT_LEFTREAR;
	
	public static  CANTalon SHOOT_MOTOR;
	public static Talon SHOOT_KICKER;
	public static Talon SHOOT_GATE;
	public static Encoder SHOOT_ENCODER;
	public static CANTalon SWEEP_MOTOR;
	{	
}
	
	public static void init() {
		//shooter stuff
		SHOOT_MOTOR = new CANTalon(6);
		SHOOT_MOTOR.setFeedbackDevice(FeedbackDevice.CtreMagEncoder_Relative);
        SHOOT_MOTOR.reverseSensor(false);
        SHOOT_MOTOR.configNominalOutputVoltage(+0.0f, -0.0f);
        SHOOT_MOTOR.configPeakOutputVoltage(+12.0f, -12.0f);
        SHOOT_MOTOR.setProfile(0); 
        SHOOT_MOTOR.setF(0);
        SHOOT_MOTOR.setP(0.04);
        SHOOT_MOTOR.setI(0.0002);
        SHOOT_MOTOR.setD(0.0001);
        SHOOT_MOTOR.changeControlMode(TalonControlMode.Speed);
		SHOOT_KICKER = new Talon(0);
		SHOOT_GATE = new Talon(1);
		
		
		
		//Drivetrain stuff
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
        
        //Sweeper stuff
        SWEEP_MOTOR = new CANTalon(5);
		
		
	
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