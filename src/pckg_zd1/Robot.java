package pckg_zd1;

public class Robot {

    private int id;
    private String name;

    public Robot(int id, String name){
        this.id = id;
        this.name = name;
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
}
