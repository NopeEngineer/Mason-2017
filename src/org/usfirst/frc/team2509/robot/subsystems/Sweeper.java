package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sweeper extends Subsystem {
	public final CANTalon MOTOR = RobotMap.SWEEP_MOTOR;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void intiDefaultCommand(){
    
    }
	
    public CANTalon getMotor(){
    	return MOTOR;
    }

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}

