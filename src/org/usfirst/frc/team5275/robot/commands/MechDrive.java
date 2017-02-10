
package org.usfirst.frc.team5275.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5275.robot.Robot;

/**
 *
 */

public class MechDrive extends Command {

    public MechDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double x = 0.5*Robot.oi.leftS.getX();
    	double y = 0.5*Robot.oi.leftS.getY();
    	double z = 0.5*Robot.oi.leftS.getZ();
    	Robot.CANDrive.mecanumDrive_Cartesian(x, y, z, 0);
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
