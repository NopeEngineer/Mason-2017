package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	private final CANTalon LEFT_FRONT = RobotMap.DT_LEFTFRONT;
	private final CANTalon Right_Front = RobotMap.DT_RIGHTFRONT;
	private final CANTalon Left_Rear = RobotMap.DT_LEFTREAR;
	private final CANTalon Right_Rear = RobotMap.DT_RIGHTREAR;
	
	public final  ADXRS450_Gyro GYRO = RobotMap.GYRO_1;
	
    private final RobotDrive DRIVETRAIN = RobotMap.DriveTrain;
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    }
    public CANTalon getLeftFront(){
	    	return LEFT_FRONT;
	    }
    public CANTalon getLeftRear(){
	    	return Left_Rear;
	    }
    public CANTalon getRightFront(){
	    	return Right_Front;
	    }
    public CANTalon getRightRear(){
	    	return Right_Rear;
	    }
    public ADXRS450_Gyro getGyro(){
	    	return GYRO;
    }
  	public RobotDrive getDrive() {
 	// TODO Auto-generated method stub
	   	return DRIVETRAIN;	
    	
    	
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
	 {
		// TODO Auto-generated method stub
		
	}
	
	}


