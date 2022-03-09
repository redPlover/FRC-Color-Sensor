package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.PicoColorSensor;

public class ColorSensorSybSystem extends SubsystemBase {
  private final PicocolorSensor = new PicoColorSensor();

  public ColorSensor() {}

  public void printColors() {
    SmartDashboard.putNumber("R", colorSensor.getRawColor0().red);
    SmartDashboard.putNumber("G", colorSensor.getRawColor0().green);
    SmartDashboard.putNumber("B", colorSensor.getRawColor0().blue);
    SmartDashboard.putNumber("ir", colorSensor.getRawColor0().ir);
    if (colorSensor.getRawColor0().red > 60) {
      SmartDashboard.putString("Ball", "Red Ball");
    } else {
      SmartDashboard.putString("Ball", "Blue Ball");
    }
  }

  @Override
  public void periodic() {
    printColors();
  }
}
