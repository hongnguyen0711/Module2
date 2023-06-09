package ss5_access_modìier_static.practice;

public class Text {

    private String name;

    private String engine;


    public static int numberOfCars;


    public Text(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }
    void Display(){
        System.out.println("name: " + this.name + "engine: " + this.engine + numberOfCars);
    }
}