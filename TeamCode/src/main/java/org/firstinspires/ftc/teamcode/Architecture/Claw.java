package org.firstinspires.ftc.teamcode.Architecture;

import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    public Claw(Servo newClaw, Servo newUp){
        claw = newClaw;
        up = newUp;
    }
    private double clawPosition = 0;
    private double upPosition = 0;
    private double targetClawPosition = 0;
    private double targetUpPosition = 0;
    private Servo up = null;
    private Servo claw = null;
    private double speed = .0005;

    public void setClawPosition(double pos){
        targetClawPosition = pos;
        clawPosition = pos;
        claw.setPosition(clawPosition);
    }
    public void setUpPosition(double pos){
        targetUpPosition = pos;
        upPosition = pos;
        up.setPosition(upPosition);
    }
    public void setTargetClawPosition(double pos){
        targetClawPosition = pos;
    }
    public void setTargetUpPostion(double pos){
        targetUpPosition = pos;
    }
    public double getUpPosition(){
        return upPosition;
    }
    public double getClawPosition(){
        return clawPosition;
    }
    // public void openClawSlow(){
    //     double pos = this.getClawPosition();
    //     if (pos<1){
    //         pos = pos + .0005;
    //         this.setClawPosition(pos);
    //     }
    // }

    public void update(){
        if (targetClawPosition > getClawPosition()){
            setClawPosition(getClawPosition() + speed);
        }else if (targetClawPosition < getClawPosition()){
            setClawPosition(getClawPosition() - speed);
        }
    }
}
