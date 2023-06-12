package ss5_access_modifier_static.practice;

public class Test {

     String name;

     String engine;


    public static int numberOfCars;


    public Test(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;
    }

    public String toString(String age) {
        return "Text{" +
                "name='" + name + '\'' +
                ", engine='" + engine + '\'' + numberOfCars + age +
                '}';
    }

    public void display(){
        System.out.println("name: " + this.name + "engine: " + this.engine + numberOfCars);
    }

}