package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	private final CANTalon MOTOR1 = RobotMap.CLIMB_MOTOR;
    private final CANTalon MOTOR2 = RobotMap.CLIMB_ALT;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public CANTalon getMotor1(){
    	return MOTOR1;
    }
    public CANTalon getMotor2(){
    	return MOTOR2;

    }
}

