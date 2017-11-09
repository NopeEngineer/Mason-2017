package org.usfirst.frc.team2509.robot.commands;

import org.usfirst.frc.team2509.robot.Robot;
import org.usfirst.frc.team2509.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShooterRun extends Command {
	//would like to know why i cant have public ShooterRun(){ here at top rather thn the bottom
    	private double TARGETSPEED = 3800 ;
    	private final CANTalon MOTOR = Robot.shooter.getShoot();
    	private final Talon KICKER = Robot.shooter.getKicker();
    	private final Talon GATE = RobotMap.SHOOT_GATE;
    	public ShooterRun() {
 
    	// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
