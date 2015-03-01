package org.usfirst.frc322.FRCTeam0322JavaCBR2015;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc322.FRCTeam0322JavaCBR2015.RobotMap;

public class ThrustmasterJoystick extends Joystick {

	public ThrustmasterJoystick(int port) {
		super(port, RobotMap.DRIVENUMAXIS, RobotMap.DRIVENUMBUTTONS);
	}

}
