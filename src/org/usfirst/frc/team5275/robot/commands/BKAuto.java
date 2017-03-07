package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.*;

//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BKAuto extends Command {

    public BKAuto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	Robot.drive.SRX1.set(-0.5);
    	Robot.drive.SRX2.set(-0.5);
    	Robot.drive.SRX3.set(-0.5);
    	Robot.drive.SRX4.set(-0.5);
    	Robot.drive.LB.set(-0.5);
    	Robot.drive.LF.set(-0.5);
    	Robot.drive.RB.set(-0.5);
    	Robot.drive.RF.set(-0.5);
    	
    /*	
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	Timer.delay(0.5);
    	Robot.drive.SRX1.set(0);
    	Robot.drive.SRX2.set(0);
    	Robot.drive.SRX3.set(0);
    	Robot.drive.SRX4.set(0);
    	Robot.drive.LB.set(0);
    	Robot.drive.LF.set(0);
    	Robot.drive.RB.set(0);
    	Robot.drive.RF.set(0);
    	
   */ 	
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
