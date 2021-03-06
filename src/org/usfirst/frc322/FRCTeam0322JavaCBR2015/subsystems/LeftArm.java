package org.usfirst.frc322.FRCTeam0322JavaCBR2015.subsystems;

import org.usfirst.frc322.FRCTeam0322JavaCBR2015.RobotMap;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LeftArm extends Subsystem {
    SpeedController leftArmRotator = RobotMap.leftArmRotator;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ArmActuator());
    }
    
	public void leftArmControl(double speed) {
		leftArmRotator.set(speed);
	}
}
