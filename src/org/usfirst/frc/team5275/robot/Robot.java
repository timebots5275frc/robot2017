
package org.usfirst.frc.team5275.robot;

import org.usfirst.frc.team5275.robot.commands.ExampleCommand;
import org.usfirst.frc.team5275.robot.commands.MechDrive;
import org.usfirst.frc.team5275.robot.commands.TankDrive;
import org.usfirst.frc.team5275.robot.commands.*;
import org.usfirst.frc.team5275.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5275.robot.subsystems.*;
import com.ctre.*;
import edu.wpi.first.wpilibj.IterativeRobot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.*;

/**
 * 
 * 
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static OI oi;
	
    Command autonomousCommand;
    Command teleopCommand;
    Command DriveSystem;
    public Command teleop = new teleop();
    public Command Tank = new TankDrive();
    public Command MechDrive = new MechDrive();
    public Command Conveyor = new Conveyor();
 //   public Command QSwitch = new QSwitch();
    Command DriveSYS;
    SendableChooser autocon;
    SendableChooser<Command> DRSYS;
    SendableChooser<Command> telecon;
    public static DriveTrain drive = new DriveTrain();
    // public static RobotDrive PWMDrive = new RobotDrive(Robot.drive.LF,Robot.drive.LB,Robot.drive.RF,Robot.drive.RB);
    public static RobotDrive CANDrive = new RobotDrive(Robot.drive.SRX1,Robot.drive.SRX2,Robot.drive.SRX3,Robot.drive.SRX4);
    
    
    Boolean i = false;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    public void robotInit() {
		oi = new OI();
        
		//Not working choosers
		autocon = new SendableChooser<Command>();
        autocon.addDefault("Forward", new FWAuto());
        autocon.addObject("Backward", new BKAuto());
        autocon.addObject("Other Auto (Don't Use)", new teleop());
        SmartDashboard.putData("Auto mode", autocon);
        DRSYS = new SendableChooser<Command>();
        DRSYS.addDefault("Tank", new TankDrive());
        DRSYS.addObject("Mech", new MechDrive());
        SmartDashboard.putData("Drive system", DRSYS);
        telecon = new SendableChooser<Command>();
        telecon.addDefault("Single Stick", new TankDrive());
        telecon.addObject("Twin Stick (Don't Use)", new MechDrive());
        SmartDashboard.putData("Control Mode", telecon);
        
        /*
		CameraServer server = CameraServer.getInstance();
		server.startAutomaticCapture(0);
         */
        
        /*
        Robot.drive.SRX1.enable();
        Robot.drive.SRX2.enable();
        Robot.drive.SRX3.enable();
        Robot.drive.SRX4.enable();
        
    	//Robot.drive.SRX1.
    	//Robot.drive.SRX1.
        
        Robot.drive.SRX1.changeControlMode(TalonControlMode.PercentVbus);
        Robot.drive.SRX2.changeControlMode(TalonControlMode.PercentVbus);
        Robot.drive.SRX3.changeControlMode(TalonControlMode.PercentVbus);
        Robot.drive.SRX4.changeControlMode(TalonControlMode.PercentVbus);
    	
        */
        
    }
	
	/*
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    
    public void disabledInit(){

    }
	
	public void disabledPeriodic() {
	//	Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
    
    	
    	autonomousCommand = (Command) autocon.getSelected();
        
/*		String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		switch(autoSelected) {
		case "My Auto":
			autonomousCommand = new FWAuto();
			break;
		case "Default Auto":
		default:
			autonomousCommand = new FWAuto();
			break;
		} 
  */  	
    	// schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
        
 		
    	
    	
    	
    	
}

    /**
    	 * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        
    	DriveSystem = (Command) DRSYS.getSelected();
    	if (DriveSystem != null) DriveSystem.start();
    	teleopCommand = (Command) telecon.getSelected();
    	if (teleopCommand != null) teleopCommand.start();
    	
        
  /*      
        Robot.drive.SRX1.enable();
        Robot.drive.SRX2.enable();
        Robot.drive.SRX3.enable();
        Robot.drive.SRX4.enable();
    	
        //Robot.drive.SRX1.
    	//Robot.drive.SRX1.
        
        Robot.drive.SRX1.getControlMode();
        Robot.drive.SRX2.getControlMode();
        Robot.drive.SRX3.getControlMode();
        Robot.drive.SRX4.getControlMode();
       
   */     
        System.out.println("robot started");
        
    }
    	
    

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	
        //Scheduler.getInstance().run();
     //   teleop.start();
        //Tank.start();
    	//PWMDrive.tankDrive(-0.9*oi.leftS.getY(), -0.9*oi.rightS.getY());
    	//CANDrive.tankdrive(-0.9*OI.le+ftS.getY(), -0.9*OI.rightS.getY());
    	CANDrive.mecanumDrive_Cartesian(.5*oi.rightS.getX(), .5*oi.rightS.getY(), .5*oi.rightS.getZ(),0);
    	//PWMDrive.mecanumDrive_Cartesian(.5*oi.rightS.getX(), .5*oi.rightS.getY(), .5*oi.rightS.getTwist(), 0);
//    	Normal Drive Using PWM slots
    	
    	
    	if (Robot.oi.BR8.get() == true){
    		Robot.drive.V1.set(1);
    	} else if (Robot.oi.BR12.get() == true){
    		Robot.drive.V1.set(-0.4);
    	} else if (Robot.oi.BR2.get() == true){
    		Robot.drive.V1.set(-0.60);
    	} else if (Robot.oi.BR1.get() == true){
    		Robot.drive.V1.set(-0.80);
    	} else {
    		Robot.drive.V1.set(0.0);
    	}
    		
   	
    	if (Robot.oi.BR7.get() == true){
    		Robot.drive.Sweep.set(0.4);
    	} else if (Robot.oi.BR11.get() == true){
    		Robot.drive.Sweep.set(-0.45);
    	} 	else {
    		Robot.drive.Sweep.set(0.0);
    	}			
   
    	
 	
    	//OI.triggerR.whenActive(QSwitch);
    	
    	
    //	Robot.drive.Con.set(0.5*oi.leftS.getY());
    	
/*    	
    	double s1 = Robot.drive.SRX1.getSpeed();
    	double s2 = Robot.drive.SRX2.getSpeed();
    	double s3 = Robot.drive.SRX3.getSpeed();
    	double s4 = Robot.drive.SRX4.getSpeed();
    	//Robot.drive.SRX1.get
    	
    	System.out.print(s1);
    	System.out.print(s2);
    	System.out.print(s3);
    	System.out.print(s4);
  */  	
    	
   // 	Robot.drive.Test.
   /* 	Robot.drive.SRX1.get();
    	Robot.drive.SRX2.get();
    	Robot.drive.SRX3.get();
    	Robot.drive.SRX4.get();
    	Robot.drive.SRX1.set(OI.rightS.getY());
*/
    	
    	
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
