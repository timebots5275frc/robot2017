
package org.usfirst.frc.team5275.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *this subsystem file is likely not needed right now, because we've essentially bypassed
 *with the rd object in the robot file
 *
 */
public class DriveTrain extends Subsystem {
    public Talon LF;
    public Talon RF;
    public Talon LB;
    public Talon RB;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

}

