
package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.OI;
import org.usfirst.frc.team5275.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Collector extends Command {
	double i;
    public Collector() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	i = ((0 - OI.leftS.getRawAxis(2)) +  1) * 0.5; // this is some stuff that we have to do to ensure that our collection motor doesn't go backwards.
        Robot.drive.Collector.set(i); // drive the collector with the 4th axis
    	
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
