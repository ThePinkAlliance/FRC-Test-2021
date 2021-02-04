// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;

public class Motors extends SubsystemBase {
  /** Creates a new Motors. */
  // WPI_TalonFX talonOne = new WPI_TalonFX(Constants.talonOneCANID);
  // WPI_TalonFX talonTwo = new WPI_TalonFX(Constants.talonTwoCANID);
  WPI_TalonFX talonThree = new WPI_TalonFX(Constants.talonThreeCANID);
  WPI_TalonFX talonFour = new WPI_TalonFX(Constants.talonFourCANID);

  public Motors() {
  }

  // public void SetTrainOneSpeed(double speed) {
  // talonOne.set(speed);
  // talonTwo.set(speed);
  // }

  public void SetTrainTwoSpeed(double speed) {
    talonThree.set(speed);
    talonFour.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
