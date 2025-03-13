package pckg_zd1;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot(120, "Ante Struja");

        robot.walk();

        int n = 12;
        long fakt = robot.factJel(n);
        System.out.println("Faktorijel je: " + fakt);



    }
}
