package ss5_access_modifier_static.practice;

public class Main {
    public static void main(String[] args) {

        Test Text1 = new Test("Mazda 3","Skyactiv 3");

        System.out.println(Test.numberOfCars);

        Test Text2 = new Test("Mazda 6","Skyactiv 6");

       Text1.display();

    }

}
