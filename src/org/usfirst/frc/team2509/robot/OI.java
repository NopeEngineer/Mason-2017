package org.usfirst.frc.team2509.robot;

import org.usfirst.frc.team2509.robot.commands.ShooterRun;
import org.usfirst.frc.team2509.robot.commands.climb;
import org.usfirst.frc.team2509.robot.subsystems.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick OPstick;
	public Joystick COOPstick;
	public JoystickButton SHOOT;
    public JoystickButton SHOOT_AIM;
    public JoystickButton SWEEP_FORWARD;
	public JoystickButton SWEEP_BACKWARD;
	public JoystickButton CLIMB;
    
	public OI() {
	
	OPstick = new Joystick(0);
	COOPstick = new Joystick(1);
	
	SHOOT = new JoystickButton(OPstick,1);
	SHOOT.whileHeld(new ShooterRun());
	
	SWEEP_FORWARD = new JoystickButton(OPstick, 3);
	SWEEP_BACKWARD = new JoystickButton(OPstick, 5);
	
	CLIMB = new JoystickButton(COOPstick, 1);
    CLIMB.whileHeld(new climb());
	
	}
	
	public Joystick getOPStick(){
		return OPstick;	
	}
	public Joystick getOpStick(){
		return COOPstick;
	}
	public double getScaledX(){
		return (OPstick.getX()*((OPstick.getRawAxis(3)+3)*0.25));
	}
	public double getScaledY(){
		return (OPstick.getY()*((OPstick.getRawAxis(3)+3)*0.25));
	}
	public double getScaledZ(){
		return (OPstick.getZ()*((OPstick.getRawAxis(3)+3)*0.25));
	}
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
