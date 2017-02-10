<<<<<<< HEAD
package org.usfirst.frc.team5275.robot.commands;

=======

package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.OI;
>>>>>>> master
import org.usfirst.frc.team5275.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Conveyor extends Command {
<<<<<<< HEAD

    public Conveyor() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
=======
	Boolean i = false;
    public Conveyor() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive);
>>>>>>> master
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
<<<<<<< HEAD
    	Robot.drive.Con.set(1.0);
=======
    	/*
    	 * a brief description of what's happening here:
    	 * if 'i' is true, turn on the Collector Talon.
    	 * then, if the left stick middle button is pressed, invert the value of the boolean.
    	 * this gives the effect of a toggle switch, such that it will only
    	 * continue going as long as the button is not pressed.
    	 */
    	if (i){
    			Robot.drive.Conveyor.set(0.5);
    	}
    	else {
    	Robot.drive.Conveyor.set(0.0);
    	}
        if (OI.LeftMiddleButton.get()){
        	i = !i; // 'flipping' the value of the boolean. This gives us the effect of a toggle switch
        }
    	
>>>>>>> master
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
