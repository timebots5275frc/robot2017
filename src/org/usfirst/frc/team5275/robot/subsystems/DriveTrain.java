package org.usfirst.frc.team5275.robot.subsystems;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Victor;
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	public Victor Out = new Victor(7);
	public Victor Winch = new Victor(9);
    public Talon LF = new Talon(1);
    public Talon RF = new Talon(3);
    public Talon LB = new Talon(2);
    public Talon RB = new Talon(4);
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