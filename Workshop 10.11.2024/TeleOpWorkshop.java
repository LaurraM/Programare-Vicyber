package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="Basic: Linear OpMode", group="Linear Opmode")
public class TeleOpWorkshop extends LinearOpMode {

    @Override
    public void runOpMode() {
        // Afișează mesajul "Initialized" în consola de telemetrie
        telemetry.addData("TAG", "Initialized");
        telemetry.update();

        // Așteaptă ca driver-ul să apese pe butonul PLAY
        waitForStart();

        // Afișează mesajul "Running" în consola de telemetrie atunci când OpMode-ul începe
        telemetry.addData("Status", "Running");
        telemetry.update();

        // Rulează o buclă până ce OpMode-ul este oprit
        while (opModeIsActive()) {
            // Afișează un mesaj de test pentru a arăta că bucla funcționează
            telemetry.addData("Loop", "OpMode is active");
            telemetry.update();

            // Adaugă o mică întârziere pentru a nu suprasolicita consola
            sleep(1000); // așteaptă 1 secundă înainte de a repeta bucla
        }

        // Afișează un mesaj final când OpMode-ul este oprit
        telemetry.addData("Status", "Stopped");
        telemetry.update();
    }
}
