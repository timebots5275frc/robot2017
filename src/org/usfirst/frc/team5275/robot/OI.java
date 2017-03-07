package org.usfirst.frc.team5275.robot;
//imports
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
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
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	
	//	Joysticks Yeah!
	public Joystick leftS = new Joystick(0);
	public Joystick rightS = new Joystick(1);

	
	//	TODO Buttons Right Joystick
    public JoystickButton BR1 = new JoystickButton(rightS, 1);
    public JoystickButton BR2 = new JoystickButton(rightS, 2);
    public JoystickButton BR3 = new JoystickButton(rightS, 3);
    public JoystickButton BR4 = new JoystickButton(rightS, 4);
    public JoystickButton BR5 = new JoystickButton(rightS, 5);
    public JoystickButton BR6 = new JoystickButton(rightS, 6);
    public JoystickButton BR7 = new JoystickButton(rightS, 7);
    public JoystickButton BR8 = new JoystickButton(rightS, 8);
    public JoystickButton BR9 = new JoystickButton(rightS, 9);
    public JoystickButton BR10 = new JoystickButton(rightS, 10);
    public JoystickButton BR11 = new JoystickButton(rightS, 11);
    public JoystickButton BR12 = new JoystickButton(rightS, 12);
 // 	TODO Buttons Left Joystick
    public JoystickButton BL1 = new JoystickButton(leftS, 1);
    public JoystickButton BL2 = new JoystickButton(leftS, 2);
    public JoystickButton BL3 = new JoystickButton(leftS, 3);
    public JoystickButton BL4 = new JoystickButton(leftS, 4);
    public JoystickButton BL5 = new JoystickButton(leftS, 5);
    public JoystickButton BL6 = new JoystickButton(leftS, 6);
    public JoystickButton BL7 = new JoystickButton(leftS, 7);
    public JoystickButton BL8 = new JoystickButton(leftS, 8);
    public JoystickButton BL9 = new JoystickButton(leftS, 9);
    public JoystickButton BL10 = new JoystickButton(leftS, 10);
    public JoystickButton BL11 = new JoystickButton(leftS, 11);
    
    


}

