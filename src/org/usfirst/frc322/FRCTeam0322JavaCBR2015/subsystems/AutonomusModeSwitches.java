package org.usfirst.frc322.FRCTeam0322JavaCBR2015.subsystems;

import org.usfirst.frc322.FRCTeam0322JavaCBR2015.RobotMap;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.commands.*;
import edu.wpi.first.wpilibj.*;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutonomusModeSwitches extends Subsystem {
    int autoMode = 0;
    boolean manualAutoSet;
    DigitalInput switch1 = RobotMap.autonomusModeSwitchesSwitch1;
    DigitalInput switch2 = RobotMap.autonomusModeSwitchesSwitch2;
    DigitalInput switch3 = RobotMap.autonomusModeSwitchesSwitch3;
    DigitalInput switch4 = RobotMap.autonomusModeSwitchesSwitch4;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public int GetMode() {
    	if (manualAutoSet) return autoMode;
    	if (switch1.get()) autoMode = autoMode + 1;
    	if (switch2.get()) autoMode = autoMode + 2;
    	if (switch3.get()) autoMode = autoMode + 4;
    	if (switch4.get()) autoMode = autoMode + 8;
    	return autoMode;
    }
    
    public void SetMode(int setting) {
    	autoMode = setting;
    	manualAutoSet = true;
    }
}
