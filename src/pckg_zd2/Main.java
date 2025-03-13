package pckg_zd2;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot(15, "Billy",4, 5);
        robot.walk();

        int[][] inputArray = {
                {2,4,6,8},
                {10,12,14,16},
                {22,24,26,28},
                {30,32,34,36},
                {38,40,42,44},
                {45,46,47,48}};

        robot.fillArr(inputArray);
        robot.printArray();

    }

}
