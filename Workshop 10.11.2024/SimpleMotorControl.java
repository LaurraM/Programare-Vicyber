package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Simple Motor Control", group="Examples")
public class SimpleMotorControl extends LinearOpMode {

    private DcMotor motor;

    @Override
    public void runOpMode() {
        motor = hardwareMap.get(DcMotor.class, "motor");

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {
            // Folosește stick-ul stâng pentru a controla motorul
            double power = -gamepad1.left_stick_y;
            motor.setPower(power);

            telemetry.addData("Motor Power", power);
            telemetry.update();
        }
    }
}
