package org.usfirst.frc.team5275.robot;


import org.usfirst.frc.team5275.robot.OI;
import org.usfirst.frc.team5275.robot.commands.BKAuto;
import org.usfirst.frc.team5275.robot.commands.LeftGear;
import org.usfirst.frc.team5275.robot.commands.MechDrive;
import org.usfirst.frc.team5275.robot.commands.MiddleGear;
import org.usfirst.frc.team5275.robot.commands.RightGear;
import org.usfirst.frc.team5275.robot.commands.Stop;
import org.usfirst.frc.team5275.robot.commands.TankDrive;
import org.usfirst.frc.team5275.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * 
 * 
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 * 
 * 
 * 
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	double slider;
	Command tempCommand;
    Command autonomousCommand;
    Command teleopCommand;
    Command DriveSystem;
    Command DriveSYS;
    public Command Tank = new TankDrive();
    public Command MechDrive = new MechDrive();
    public Command Middle = new MiddleGear();
    public Command Right = new RightGear();
    public Command BKAuto = new BKAuto();
    public Command Stop = new Stop();
    public Timer Time = new Timer();
    //public Command  = new ();
 //   public Command QSwitch = new QSwitch();
    
    SendableChooser<Command> autocon;
    SendableChooser<Command> DRSYS;
    SendableChooser<Command> telecon;
    public static DriveTrain drive = new DriveTrain();
    public static RobotDrive PWMDrive = new RobotDrive(Robot.drive.LF,Robot.drive.LB,Robot.drive.RF,Robot.drive.RB);
    public static RobotDrive CANDrive = new RobotDrive(Robot.drive.SRX1,Robot.drive.SRX2,Robot.drive.SRX3,Robot.drive.SRX4);
    LiveWindowSendable LFT;
 /*   void SmartDashboard() {
    	SendableChooser<Command> autocon;
        SendableChooser<Command> DRSYS;
        SendableChooser<Command> telecon;
    };
 */   
    Boolean i = false;
    
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    
    public void robotInit() {
		oi = new OI();
//		CameraServer cServer = CameraServer.getInstance();
		//cServer.startAutomaticCapture("FrontCamera", 0);
		//Not working choosers
		
		autocon = new SendableChooser<Command>();
        autocon.addDefault("Middle", new MiddleGear());
        autocon.addObject("Right Gear", new RightGear());
        autocon.addObject("Left Gear", new LeftGear());
        autocon.addObject("Backward", new BKAuto());
        SmartDashboard.putData("Auto Selector", autocon);
        
        DRSYS = new SendableChooser<Command>();
        DRSYS.addDefault("Tank", new TankDrive());
        DRSYS.addObject("Mech", new MechDrive());
        SmartDashboard.putData("Drive system", DRSYS);
        
        telecon = new SendableChooser<Command>();
        telecon.addDefault("Single Stick", new TankDrive());
        telecon.addObject("Twin Stick (Don't Use)", new MechDrive());
        SmartDashboard.putData("Control Mode", telecon);
        
        boolean C = SmartDashboard.containsKey("Auto selector");
        SmartDashboard.containsKey("Auto selector");
        System.out.println(C);

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

    	
}

    /**
    	 * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        
        
        /**
         * Choosers for the default dashboard.
         * Look in the Basic Tab
         * 
         * You can add information to the Dashboard by changing .get to .put
         * and by putting a value into the spot after the key
         * 
         * The Following three lines show this.
         **/
        SmartDashboard.putString("DB/String 3", "Showing");
        SmartDashboard.putNumber("DB/Slider 3", 2.5);
        SmartDashboard.putBoolean("DB/Button 3", true);
        
        tempCommand = autocon.getSelected();
        tempCommand.start();
        
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        
    	DriveSystem = (Command) DRSYS.getSelected();
    	DriveSystem.start();
    	teleopCommand = (Command) telecon.getSelected();
    	teleopCommand.start();
        System.out.println("robot started");
        
    }
    	
    

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	

    	slider = oi.rightS.getRawAxis(3);
    	slider = -(slider - 1) / 2;
    	//TODO The above code needs to be tested. try printing the value of slider.
    	 
    	 String Drive = SmartDashboard.getString("DB/String 5", "");
    	 System.out.println(slider);
         if (Drive.equalsIgnoreCase("PWM Mech")) {
    	 PWMDrive.mecanumDrive_Cartesian(slider*oi.rightS.getX(), slider*oi.rightS.getY(), slider*oi.rightS.getTwist(), 0);
        	 // Mecanum Drive Using PWM slots
    	 	System.out.println("PWM Mech Drive");
         } else { //(Drive.equalsIgnoreCase("CAN Mech"))
        	 CANDrive.mecanumDrive_Cartesian(slider*oi.rightS.getX(), slider*oi.rightS.getY(), slider*oi.rightS.getZ(),0);
        	 // Mecanum Drive Using CAN Speed Controllers
        	 System.out.println("PWM CAN Drive");
         } 
         

    	
    	
    	
    	
    	if (Robot.oi.BL6.get() == true){
    		Robot.drive.Out.set(0.4);
    	} else if (Robot.oi.BL7.get() == true){
    		Robot.drive.Out.set(-0.5);
    	} else if (Robot.oi.BL8.get() == true) {
    		Robot.drive.Out.set(1);
    	} else {
    		Robot.drive.Out.set(0.0);
    	}
    	
    	// Double i = 1; 
    	if (Robot.oi.BL4.get() == true) {
    		Robot.drive.Winch.set(-0.5);
    	} else if(Robot.oi.BL2.get() == true) {
    			Robot.drive.Winch.set(-1);
    	} else if(Robot.oi.BL5.get() == true) {
			Robot.drive.Winch.set(0.5);
    	} else if(Robot.oi.BL3.get() == true) {
			Robot.drive.Winch.set(1);
    	} else {
    		Robot.drive.Winch.set(0.0);
    	}
    		
   	
    	if (Robot.oi.BL11.get() == true){
    		Robot.drive.Sweep.set(-0.45);
    	} else if (Robot.oi.BL10.get() == true){
    		Robot.drive.Sweep.set(0.5);
    	} else if (Robot.oi.BL9.get() == true) {
    		Robot.drive.Sweep.set(1);
    	} else {
    		Robot.drive.Sweep.set(0.0);
    	}			
   
    	
 	

    	
    	
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}