// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motors extends SubsystemBase {
  CANSparkMax motor2 = new CANSparkMax(2, MotorType.kBrushless);
  /** Creates a new Motors. */


  public Motors() {
    
    
  }

  public void MoveRoller(double param){
    motor2.set(param);
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Encoder Speed", motor2.get());
    // This method will be called once per scheduler run
  }
}
