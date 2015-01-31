// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc319;
    

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
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
    public static DoubleSolenoid rearClawClawPnuematic;
    public static DoubleSolenoid rearArmTopPnuematic;
    public static DoubleSolenoid rearArmBottomPnuematic;
    public static Compressor pnuematicSystemCompressor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon rearShoulderMotor;
    
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        rearClawClawPnuematic = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("RearClaw", "ClawPnuematic", rearClawClawPnuematic);
        
        rearArmTopPnuematic = new DoubleSolenoid(1, 0, 1);      
        LiveWindow.addActuator("RearArm", "TopPnuematic", rearArmTopPnuematic);
        
        rearArmBottomPnuematic = new DoubleSolenoid(0, 4, 5);      
        LiveWindow.addActuator("RearArm", "BottomPnuematic", rearArmBottomPnuematic);
        
        pnuematicSystemCompressor = new Compressor(0);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        rearShoulderMotor = new CANTalon(1);
    }
}
