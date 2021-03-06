package org.usfirst.frc322.FRCTeam0322JavaCBR2015.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.Robot;

/**
 *
 */
public class AutonMoveForward extends Command {

    public AutonMoveForward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.chassis);
    }

    public AutonMoveForward(double timeout) {
    	super(timeout);
    	requires(Robot.chassis);
	}

	// Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassis.autoDriveSystem(0.75, 0.0, 0.0);
    		
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (this.isTimedOut())
    		return true;
    	else
    		return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassis.autoDriveSystem(0.0, 0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
