package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Slide Control", group="Examples")
public class SlideControl extends LinearOpMode {

    private DcMotor slideMotor; // Motorul pentru controlul glisierei

    @Override
    public void runOpMode() {
        // Inițializarea motorului pentru glisieră
        slideMotor = hardwareMap.get(DcMotor.class, "slideMotor");

        // Setare direcție motor (opțional, depinde de configurație)
        slideMotor.setDirection(DcMotor.Direction.FORWARD);

        // Afișare stare de inițializare
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        // Așteaptă ca utilizatorul să apese "PLAY"
        waitForStart();

        // Bucla principală de control
        while (opModeIsActive()) {
            // Control pentru glisieră
            if (gamepad1.dpad_up) {
                // Butonul dpad_up este apăsat - glisiera se ridică
                slideMotor.setPower(0.5); // Setăm o putere pozitivă
            } else if (gamepad1.dpad_down) {
                // Butonul dpad_down este apăsat - glisiera coboară
                slideMotor.setPower(-0.5); // Setăm o putere negativă
            } else {
                // Niciun buton nu este apăsat - glisiera se oprește
                slideMotor.setPower(0);
            }

            // Afișare telemetrie pentru debugging
            telemetry.addData("Slide Motor Power", slideMotor.getPower());
            telemetry.update();
        }
    }
}
