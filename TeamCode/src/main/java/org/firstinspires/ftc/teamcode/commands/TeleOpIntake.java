package org.firstinspires.ftc.teamcode.commands;

import org.firstinspires.ftc.teamcode.commander.Command;
import org.firstinspires.ftc.teamcode.subsystems.Intake;

public class TeleOpIntake implements Command {

    private Intake intake;

    public TeleOpIntake(Intake intake) {
        this.intake = intake;
    }


    @Override
    public void start() {

    }

    @Override
    public void periodic() {

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isCompleted() {
        return false;
    }

}
