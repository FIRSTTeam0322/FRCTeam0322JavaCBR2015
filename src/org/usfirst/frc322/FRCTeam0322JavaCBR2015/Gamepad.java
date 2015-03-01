package org.usfirst.frc322.FRCTeam0322JavaCBR2015;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.RobotMap;

public class Gamepad extends Joystick {
	
	public Gamepad(int port) {
		super(port, RobotMap.MANIPULATORNUMAXIS, RobotMap.MANIPULATORNUMBUTTONS);
	}

}
