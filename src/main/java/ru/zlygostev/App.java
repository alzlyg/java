package ru.zlygostev;

/**
 * Hello world!
 *
 */



public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team(); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
