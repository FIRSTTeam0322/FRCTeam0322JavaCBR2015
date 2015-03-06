package org.usfirst.frc322.FRCTeam0322JavaCBR2015.commands;

import org.usfirst.frc322.FRCTeam0322JavaCBR2015.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class WheelsIn extends Command {

    public WheelsIn() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.leftArmWheel);
    	requires(Robot.rightArmWheel);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.leftArmWheel.leftWheelControl(1.0);
    	Robot.rightArmWheel.rightWheelControl(-1.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.leftArmWheel.leftWheelControl(0.0);
    	Robot.rightArmWheel.rightWheelControl(0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
