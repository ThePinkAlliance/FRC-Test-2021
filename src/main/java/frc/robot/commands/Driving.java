// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Motors;

public class Driving extends CommandBase {
  /** Creates a new Driving. */
  private DoubleSupplier rightJS;
  private DoubleSupplier leftJS;
  private Motors m_motors;

  public Driving(Motors motors, DoubleSupplier rightJS, DoubleSupplier leftJS) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.leftJS = leftJS;
    this.rightJS = rightJS;
    this.m_motors = motors;

    addRequirements(m_motors);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // m_motors.SetTrainOneSpeed(this.rightJS.getAsDouble());
    m_motors.SetTrainTwoSpeed(this.leftJS.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
