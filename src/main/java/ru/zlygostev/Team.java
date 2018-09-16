package ru.zlygostev;

public class Team {
    String CommandName;
    Boolean Player1Res;
    Boolean Player2Res;
    Boolean Player3Res;
    Boolean Player4Res;

    public void Team(){
        CommandName = "TeamName";
        Player1Res = false;
        Player2Res = false;
        Player3Res = false;
        Player4Res = false;
    }

    public void showResults(){
        System.out.println( CommandName );
        System.out.println( "Player1 " );
        if (Player1Res)
            System.out.println( "прошёл полосу препятствий" );
        else
            System.out.println( "не прошёл полосу препятствий" );

        System.out.println( "Player2 " );
        if (Player2Res)
            System.out.println( "прошёл полосу препятствий" );
        else
            System.out.println( "не прошёл полосу препятствий" );


        System.out.println( "Player3 " );
        if (Player3Res)
            System.out.println( "прошёл полосу препятствий" );
        else
            System.out.println( "не прошёл полосу препятствий" );

        System.out.println( "Player4 " );
        if (Player4Res)
            System.out.println( "прошёл полосу препятствий" );
        else
            System.out.println( "не прошёл полосу препятствий" );
    }

}

