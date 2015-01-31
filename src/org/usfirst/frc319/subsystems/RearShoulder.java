// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc319.subsystems;

import org.usfirst.frc319.RobotMap;
import org.usfirst.frc319.Robot;
import org.usfirst.frc319.commands.*;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.ControlMode;
import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class RearShoulder extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	CANTalon rearShoulderMotor = RobotMap.rearShoulderMotor;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public RearShoulder() {
		
	    // Put methods for controlling this subsystem
	    // here. Call these from Commands.
		  
		rearShoulderMotor.changeControlMode(ControlMode.Position);
		rearShoulderMotor.setFeedbackDevice(FeedbackDevice.QuadEncoder);
		rearShoulderMotor.setPID(50, 0, 0);
		rearShoulderMotor.reverseSensor(true);
	}

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new RearShoulderStop());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void goToTop(){
    	rearShoulderMotor.set(5000);
    	//System.out.println("Encoder = "+cANTalon.getEncPosition());
    	//System.out.println("current = "+cANTalon.getOutputCurrent());
    }
    public void goToBottom(){
    	rearShoulderMotor.set(0);
    	//System.out.println("Encoder = "+cANTalon.getEncPosition());
    	//System.out.println("current = "+cANTalon.getOutputCurrent());
    }
    public void spin(){
    	rearShoulderMotor.set(6);
    }



    public void stop() {
    	//Robot.motor.cANTalon.set();
    	//Robot.elevator2.cANTalon.getEncPosition();
    	
    }
    public boolean isFinished(){
    	double error = rearShoulderMotor.getEncPosition()-rearShoulderMotor.getSetpoint();
    	if (Math.abs(error)>5) {
    	return false;
    	}
    	else{
    		return true;
    	}
    }
}

