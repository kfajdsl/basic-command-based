package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.commander.Subsystem;

public class Intake implements Subsystem {
    private DcMotor left, right;
    private HardwareMap hardwareMap;

    public Intake(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
    }

    public void setPower(double power) {

    }

    @Override
    public void initHardware() {
        left = hardwareMap.dcMotor.get("leftIntake");
        right = hardwareMap.dcMotor.get("rightIntake");

        right.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    @Override
    public void periodic() {

    }
}
