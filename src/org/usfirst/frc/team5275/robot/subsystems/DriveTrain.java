<<<<<<< HEAD

package org.usfirst.frc.team5275.robot.subsystems;
import edu.wpi.first.wpilibj.CANSpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	public Victor V1 = new Victor(7);
    public Talon LF = new Talon(1);
    public Talon RF = new Talon(3);
    public Talon LB = new Talon(2);
    public Talon RB = new Talon(4);
    public Talon Con = new Talon(9);
    public Talon Sweep = new Talon(8);
    public CANTalon SRX1 = new CANTalon(1);
    public CANTalon SRX2 = new CANTalon(2);
    public CANTalon SRX3 = new CANTalon(3);
    public CANTalon SRX4 = new CANTalon(4);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    }

}

=======

package org.usfirst.frc.team5275.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/*
 *This manages our motors so we have them all in one place.
 */
public class DriveTrain extends Subsystem {
	public static Servo camServo = new Servo(6);
    public static Victor Collector = new Victor(8);
    public static Spark Conveyor = new Spark(9);
    /*
     * initializing our drive motors, Talon SRXs
     
    public static CANTalon SRX1 = new CANTalon(1);
    public static CANTalon SRX2 = new CANTalon(2);
    public static CANTalon SRX3 = new CANTalon(3);
    public static CANTalon SRX4 = new CANTalon(4);
    */
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

}

>>>>>>> master
