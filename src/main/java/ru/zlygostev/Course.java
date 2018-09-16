package ru.zlygostev;

public class Course {
    public void Course(){
    }

    public void doIt(Team TeamInPlay){
        TeamInPlay.Player1Res = true;
        TeamInPlay.Player2Res = false;
        TeamInPlay.Player3Res = true;
        TeamInPlay.Player4Res = false;
    }
}
