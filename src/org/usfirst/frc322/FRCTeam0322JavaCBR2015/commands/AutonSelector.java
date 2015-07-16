package org.usfirst.frc322.FRCTeam0322JavaCBR2015.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc322.FRCTeam0322JavaCBR2015.RobotMap;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.Robot;

/**
 *
 */
public class AutonSelector extends Command {

	int mode;
	Command autonCommand = null;
	
    public AutonSelector() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.autonomusModeSwitches);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	mode = Robot.autonomusModeSwitches.GetMode();
    	switch(mode)
    	{
    		case 0:
    			autonCommand = new AutonDoNothing(15.0);
    			break;
    			
    		case 1:
    			autonCommand = new AutonMoveForward(1.5);
    			break;
    		
    		default:
    			autonCommand = new AutonDoNothing();
    			return;
    	}
    	autonCommand.start();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
