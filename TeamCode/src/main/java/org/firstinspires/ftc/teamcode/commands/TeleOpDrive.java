package org.firstinspires.ftc.teamcode.commands;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.commander.Command;
import org.firstinspires.ftc.teamcode.subsystems.Drive;

public class TeleOpDrive implements Command {

    private Drive drive;
    private Gamepad gamepad;
    ElapsedTime timer;

    public TeleOpDrive(Drive drive, Gamepad gamepad) {
        this.drive = drive;
        this.gamepad = gamepad;
    }

    @Override
    public void start() {
        drive.setPower(0, 0);
        timer = new ElapsedTime();
    }

    @Override
    public void periodic() {
        drive.setPower(gamepad.left_stick_y, gamepad.right_stick_y);
    }

    @Override
    public void stop() {
        drive.setPower(0,0);
    }

    @Override
    public boolean isCompleted() {
        return timer.milliseconds() > 10000;
    }
}
