// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc0000;

import edu.wpi.first.wpilibj.RobotBase;

public final class Main {
    /**
     * Main initialization function. Do not perform any initialization here.
     * If you change your main robot class, change the parameter type.
     */
    public static void main(String... args) {
        RobotBase.startRobot(Robot::new);
    }
}