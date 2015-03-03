package org.usfirst.frc322.FRCTeam0322JavaCBR2015.subsystems;

import org.usfirst.frc322.FRCTeam0322JavaCBR2015.RobotMap;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.commands.ArmActuator;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class LeftArm extends Subsystem {
    SpeedController leftArmRotator = RobotMap.leftArmRotator;
    SpeedController leftArmWheel = RobotMap.leftArmWheel;
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

	public void leftWheelControl(double speed) {
		leftArmWheel.set(speed);
	}
}
	