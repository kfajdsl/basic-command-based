package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.commander.Subsystem;

public class Drive implements Subsystem {

    private DcMotor left, right;
    private HardwareMap hardwareMap;
    private double leftPower, rightPower;

    public Drive(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
    }

    public void setPower(double leftPower, double rightPower) {
        this.leftPower = leftPower;
        this.rightPower = rightPower;
    }

    @Override
    public void initHardware() {
        left = hardwareMap.dcMotor.get("left");
        right = hardwareMap.dcMotor.get("right");
    }

    @Override
    public void periodic() {
        left.setPower(leftPower);
        right.setPower(rightPower);
    }
}
