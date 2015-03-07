// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc322.FRCTeam0322JavaCBR2015.subsystems;

import org.usfirst.frc322.FRCTeam0322JavaCBR2015.RobotMap;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Chassis extends Subsystem {
    SpeedController frontLeftMotor = RobotMap.chassisFrontLeftMotor;
    SpeedController rearLeftMotor = RobotMap.chassisRearLeftMotor;
    SpeedController frontRightMotor = RobotMap.chassisFrontRightMotor;
    SpeedController rearRightMotor = RobotMap.chassisRearRightMotor;
    RobotDrive robotDrive41 = RobotMap.chassisRobotDrive41;
    
    DigitalOutput frontLeftBrake = RobotMap.chassisFrontLeftBrake;
    DigitalOutput rearLeftBrake = RobotMap.chassisRearLeftBrake;
    DigitalOutput frontRightBrake = RobotMap.chassisFrontRightBrake;
    DigitalOutput rearRightBrake = RobotMap.chassisRearRightBrake;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new DriveWithJoystick());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveWithJoystick(Joystick driveStick){
    	robotDrive41.mecanumDrive_Polar(driveStick.getY(), driveStick.getX(), driveStick.getZ());
    	//robotDrive41.mecanumDrive_Cartesian(driveStick.getRawAxis(0), driveStick.getRawAxis(1),	driveStick.getRawAxis(2),
    	//									RobotMap.chassisSensorsGyro1.getAngle());
    }
    
    public void autoDriveSystem(double magnitude, double direction, double rotation) {
    	robotDrive41.mecanumDrive_Polar(magnitude, direction, rotation);
    }
    
    public void brake() {
    	frontLeftBrake.set(true);
    	frontRightBrake.set(true);
    	rearLeftBrake.set(true);
    	rearRightBrake.set(true);
    }
    
    public void coast() {
    	frontLeftBrake.set(false);
    	frontRightBrake.set(false);
    	rearLeftBrake.set(false);
    	rearRightBrake.set(false);
    }
}
