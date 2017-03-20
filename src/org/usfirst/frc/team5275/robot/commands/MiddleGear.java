package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.Robot;
//import org.usfirst.frc.team5275.robot.commands.*;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MiddleGear extends Command {

//	Command F25 = new Forward25();
//	Command Stop = new Stop();
	
	Timer Time = new Timer();
	
    public MiddleGear() {
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
	    boolean v2 = true;
	    boolean v3 = true;
	    if (Time.get() < 2.0){
	    	
	    	Robot.PWMDrive.mecanumDrive_Cartesian(0.0, -0.5, 0, 0);
	    	Robot.CANDrive.mecanumDrive_Cartesian(0.0, -0.5, 0, 0);
	    	
	    	if (v2 == true) {
	    	System.out.print(CTime);
	    	v2 = false;
	    	}
	    }
	    	
    	if (Time.get() > 2) {
    		Robot.PWMDrive.mecanumDrive_Cartesian(0.0, 0.0, 0, 0);
	    	Robot.CANDrive.mecanumDrive_Cartesian(0.0, 0.0, 0, 0);
    		Time.stop();
    	
	    	if (v3 == true) {
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
