package pckg_zd2;

public class Robot {

    private int id;
    private String name;

    private int[][] array;
    private int columns;
    private int rows;

    public Robot(int id, String name, int columns, int rows){
        this.id = id;
        this.name = name;
        this.columns = columns;
        this.rows = rows;
        this.array = new int[rows][columns];
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void walk(){
        System.out.println("I roboti znaju hodati.");
    }

    public int factJel(int n){
        if (n < 0){
            System.out.println("Broj mora biti pozitivan!");
        }
        long fact = 1;
        for (int i=2; i<=n; i++){
            fact*=i;
        }
        return (int) fact;
    }


    public void fillArr(int[][] inputArray) {
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (count < inputArray.length*inputArray[0].length) {
                    array[i][j] = inputArray[count / inputArray[0].length][count%inputArray[0].length];
                    count++;
                }else{
                    return;
                }
            }
        }
    }

    public void printArray(){
        for(int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                System.out.println(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}