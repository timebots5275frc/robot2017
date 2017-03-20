package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.Robot;
//import org.usfirst.frc.team5275.robot.commands.*;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Forward25 extends Command {
	Command Stop = new Stop();
    public Forward25() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.SRX1.set(0.25);
    	Robot.drive.SRX2.set(0.25);
    	Robot.drive.SRX3.set(0.25);
    	Robot.drive.SRX4.set(0.25);
    	Robot.drive.LB.set(0.25);
    	Robot.drive.LF.set(0.25);
    	Robot.drive.RB.set(0.25);
    	Robot.drive.RF.set(0.25);
    	
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
