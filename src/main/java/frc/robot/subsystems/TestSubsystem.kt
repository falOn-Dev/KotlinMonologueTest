package frc.robot.subsystems

import edu.wpi.first.math.geometry.Pose2d
import edu.wpi.first.math.geometry.Rotation2d
import edu.wpi.first.wpilibj2.command.Subsystem
import edu.wpi.first.wpilibj2.command.SubsystemBase

class TestSubsystem : SubsystemBase("TestSubsystem") {
    var subsystemDouble: Double = 0.0
    var subsystemBool: Boolean = false
    var subsystemPose: Pose2d = Pose2d()


    override fun periodic() {
        subsystemBool = !subsystemBool
        subsystemPose = Pose2d(Math.random(), Math.random(), Rotation2d.fromDegrees(Math.random()))
        subsystemDouble = Math.random()
    }
}