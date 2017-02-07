
package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.OI;
import org.usfirst.frc.team5275.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ConveyorReverse extends Command {
    public ConveyorReverse() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	/*
    	 * a brief description of what's happening here:
    	 * if 'i' is true, turn on the Collector Talon.
    	 * then, if the left stick middle button is pressed, invert the value of the boolean.
    	 * this gives the effect of a toggle switch, such that it will only
    	 * continue going as long as the button is not pressed.
    	 */
    	Robot.drive.Conveyor.set(-0.5);
    	
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
