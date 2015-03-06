// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc322.FRCTeam0322JavaCBR2015;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import java.util.Vector;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController chassisFrontLeftMotor;
    public static SpeedController chassisRearLeftMotor;
    public static SpeedController chassisFrontRightMotor;
    public static SpeedController chassisRearRightMotor;
    public static RobotDrive chassisRobotDrive41;
    public static Gyro chassisSensorsGyro1;
    public static SpeedController leftArmRotator;
    public static SpeedController rightArmRotator;
    public static SpeedController leftArmWheel;
    public static SpeedController rightArmWheel;
    public static SpeedController liftLiftMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static int DRIVENUMAXIS = 4;
    public static int DRIVENUMBUTTONS = 16;
    public static int MANIPULATORNUMAXIS = 5;
    public static int MANIPULATORNUMBUTTONS = 12;

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisFrontLeftMotor = new Talon(0);
        LiveWindow.addActuator("Chassis", "FrontLeftMotor", (Talon) chassisFrontLeftMotor);
        
        chassisRearLeftMotor = new Talon(1);
        LiveWindow.addActuator("Chassis", "RearLeftMotor", (Talon) chassisRearLeftMotor);
        
        chassisFrontRightMotor = new Talon(2);
        LiveWindow.addActuator("Chassis", "FrontRightMotor", (Talon) chassisFrontRightMotor);
        
        chassisRearRightMotor = new Talon(3);
        LiveWindow.addActuator("Chassis", "RearRightMotor", (Talon) chassisRearRightMotor);
        
        chassisRobotDrive41 = new RobotDrive(chassisFrontLeftMotor, chassisRearLeftMotor,
              chassisFrontRightMotor, chassisRearRightMotor);
        
        chassisRobotDrive41.setSafetyEnabled(true);
        chassisRobotDrive41.setExpiration(0.1);
        chassisRobotDrive41.setSensitivity(0.5);
        chassisRobotDrive41.setMaxOutput(1.0);

        chassisSensorsGyro1 = new Gyro(0);
        LiveWindow.addSensor("Chassis Sensors", "Gyro 1", chassisSensorsGyro1);
        chassisSensorsGyro1.setSensitivity(0.007);
        leftArmRotator = new Talon(4);
        LiveWindow.addActuator("LeftArm", "LeftArmRotator", (Talon) leftArmRotator);
        
        rightArmRotator = new Talon(5);
        LiveWindow.addActuator("RightArm", "RightArmRotator", (Talon) rightArmRotator);
        
        leftArmWheel = new Talon(6);
        LiveWindow.addActuator("LeftArmWheel", "LeftArmWheel", (Talon) leftArmWheel);
        
        rightArmWheel = new Talon(7);
        LiveWindow.addActuator("RightArmWheel", "RightArmWheel", (Talon) rightArmWheel);
        
        liftLiftMotor = new Victor(8);
        LiveWindow.addActuator("Lift", "LiftMotor", (Victor) liftLiftMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
        chassisRobotDrive41.setInvertedMotor(MotorType.kRearLeft, false);
        chassisRobotDrive41.setInvertedMotor(MotorType.kFrontLeft, false);
        chassisRobotDrive41.setInvertedMotor(MotorType.kRearRight, true);
        chassisRobotDrive41.setInvertedMotor(MotorType.kFrontRight, true);
    }
}
