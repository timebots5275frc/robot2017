
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

