package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.Robot;
import org.usfirst.frc.team5275.robot.commands.*;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FWAuto extends Command {

	Command F25 = new Forward25();
	Command Stop = new Stop();
	
	Timer Time = new Timer();
	
    public FWAuto() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Time.reset();
    	Time.start();
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	double CTime = Time.get();
	    Time.get();
	    System.out.print(CTime);
	    if (Time.get() < 2.0){
	    	
	    	Robot.drive.SRX1.set(0.25);
	    	Robot.drive.SRX2.set(0.25);
	    	Robot.drive.SRX3.set(0.25);
	    	Robot.drive.SRX4.set(0.25);
	    	Robot.drive.LB.set(0.25);
	    	Robot.drive.LF.set(0.25);
	    	Robot.drive.RB.set(0.25);
	    	Robot.drive.RF.set(0.25);
	    	boolean v2 = true;
	    	if (v2 = true) {
	    	System.out.print(CTime);
	    	v2 = false;
	    	}
	    }
	    	
    	if (Time.get() > 2) {
    		Robot.drive.SRX1.set(0);
        	Robot.drive.SRX2.set(0);
        	Robot.drive.SRX3.set(0);
        	Robot.drive.SRX4.set(0);
        	Robot.drive.LB.set(0);
        	Robot.drive.LF.set(0);
        	Robot.drive.RB.set(0);
        	Robot.drive.RF.set(0);
    		Time.stop();
    		boolean v3 = true;
	    	if (v3 = true) {
	    	System.out.print(CTime);
	    	v3 = false;
	    	}	
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
