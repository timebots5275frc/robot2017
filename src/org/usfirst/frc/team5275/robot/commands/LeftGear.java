package org.usfirst.frc.team5275.robot.commands;

import org.usfirst.frc.team5275.robot.*;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 * FROM THE DRIVER STATION PERSPECTIVE THIS IS THE LEFT GEAR
 */
public class LeftGear extends Command {

//	Command F25 = new Forward25();
//	Command Stop = new Stop();
	
	Timer Time = new Timer();
	
    public LeftGear() {
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
    protected void execute(){
    	
    	double CTime = Time.get();
	    //Time.get(); Shouldn't be necessary
	    System.out.print(CTime);
	    boolean v2 = true;
	    boolean v3 = true;
	    if (Time.get() < 2.4 && Time.get() > 0.1 ){
	    	
	    	Robot.PWMDrive.mecanumDrive_Cartesian(0.0, 0.25, 0, 0);
	    	Robot.CANDrive.mecanumDrive_Cartesian(0.0, 0.25, 0, 0);
	    	
	    	
	    	if (v2 == true) {
	    	System.out.print(CTime);
	    	v2 = false;
	    	}
	    }
	    else if (Time.get() < 2.8 && Time.get() > 2.4){
	    	Robot.PWMDrive.mecanumDrive_Cartesian(0.0, 0.0, 0.5, 0);
	    	Robot.CANDrive.mecanumDrive_Cartesian(0.0, 0.0, 0.5, 0);	    	
	    }
	    else if (Time.get() < 3.0 && Time.get() > 2.8){
	    	Robot.PWMDrive.mecanumDrive_Cartesian(0.0, 0.25, 0, 0);
	    	
	    }
    	if (Time.get() > 3.0 && Time.get() < 3.50 ) {
    		Robot.PWMDrive.mecanumDrive_Cartesian(0.0, 0.25, 0, 0);
	    	Robot.CANDrive.mecanumDrive_Cartesian(0.0, 0.25, 0, 0);

    	
    	}
    	if (Time.get() > 3.45) {
    		Robot.PWMDrive.mecanumDrive_Cartesian(0.0, 0.0, 0, 0);
	    	Robot.CANDrive.mecanumDrive_Cartesian(0.0, 0.0, 0, 0);
    		//Time.stop();
    	
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
