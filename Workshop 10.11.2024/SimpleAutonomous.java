package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
@Autonomous(name="Simple Autonomous", group="Examples")
public class SimpleAutonomous extends LinearOpMode {

    private DcMotor motor;

    @Override
    public void runOpMode() {
        motor = hardwareMap.get(DcMotor.class, "motor");

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        motor.setPower(0.5);
        sleep(1000); // Merge înainte timp de 1 secundă

        motor.setPower(-0.5);
        sleep(3000); // Merge înapoi timp de 3 secunde

        motor.setPower(0); // Oprește motorul
    }
}
