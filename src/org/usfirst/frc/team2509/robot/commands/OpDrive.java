package org.usfirst.frc.team2509.robot.commands;

import org.usfirst.frc.team2509.robot.OI;
import org.usfirst.frc.team2509.robot.Robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OpDrive extends Command {
	private OI OI = Robot.oi;
	private RobotDrive DRIVETRAIN = Robot.driveTrain.getDrive();

    public OpDrive() {
    	requires(Robot.driveTrain);
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/**ok im also gonna comment pon this... maybe but nate just told me that this is to disable the x in the drivetrain so you can
 	    *go straight and also faster, or something like that
 	    */
 	if(OI.OPstick.getRawButton(8)||OI.OPstick.getRawButton(7)){
 	  DRIVETRAIN.mecanumDrive_Cartesian(0, OI.getScaledY(), OI.getScaledZ(), 0);
 	   }else{
 	  DRIVETRAIN.mecanumDrive_Cartesian(OI.getScaledX(), OI.getScaledY(), OI.getScaledZ(), 0);
 	    	}
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
