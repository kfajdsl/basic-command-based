package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.commander.DogeCommander;
import org.firstinspires.ftc.teamcode.commander.DogeOpMode;
import org.firstinspires.ftc.teamcode.commands.TeleOpDrive;
import org.firstinspires.ftc.teamcode.commands.TeleOpIntake;
import org.firstinspires.ftc.teamcode.subsystems.Drive;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class TeleOpMode extends LinearOpMode implements DogeOpMode {
    @Override
    public void runOpMode() {
        DogeCommander commander = new DogeCommander(this);

        Drive drive = new Drive(hardwareMap);
        Intake intake = new Intake(hardwareMap);

        commander.registerSubsystem(drive);
        commander.registerSubsystem(intake);

        commander.init();

        commander.runCommandsParallel(
                new TeleOpDrive(drive, gamepad1),
                new TeleOpIntake(intake)
        );

    }
}
