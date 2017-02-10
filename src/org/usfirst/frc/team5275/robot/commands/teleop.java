/*
 * a command to tank-drive/skid-steer a robot
 * 
 */

package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.OI;
import org.usfirst.frc.team5275.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class teleop extends Command {

    public teleop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.oi.leftS.getRawAxis(1);
    	Robot.oi.rightS.getRawAxis(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//this should give us the command-based mecanum drive we were looking for
//    	Robot.PWMDrive.mecanumDrive_Cartesian(Robot.oi.rightS.getX(), Robot.oi.rightS.getY(), Robot.oi.rightS.getTwist(),0);
   // 	triggerR.whenPressed(new reverse);
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
