package org.firstinspires.ftc.teamcode.Architecture;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MyMotor {
    private DcMotor motor = null;

    public MyMotor (HardwareMap hardwareMap, String name , DcMotorSimple.Direction rotation){
        motor = hardwareMap.get(DcMotor.class, "left_drive");
        motor.setDirection(rotation);

    }

    public void setPower(double power){
        motor.setPower(power);
    }
}
