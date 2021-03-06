package org.usfirst.frc322.FRCTeam0322JavaCBR2015.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc322.FRCTeam0322JavaCBR2015.Robot;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.subsystems.Chassis;

/**
 *
 */
public class BrakeControlSystem extends Command {

    public BrakeControlSystem() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.brake();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.coast();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
