package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Basic: Linear OpMode", group="Linear Opmode")
public class StructuraTeleOp extends LinearOpMode {

    private DcMotor motor=null;
    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        motor= hardwareMap.get(DcMotor.class, "MotorTest");
        // Așteaptă ca driverul să apese "PLAY"
        waitForStart();

        // Rulează în buclă până ce driverul apasă "STOP"
        while (opModeIsActive()) {
            //Setam puterea motorului
            double power= -gamepad1.left_stick_y;
            motor.setPower(power);

            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
