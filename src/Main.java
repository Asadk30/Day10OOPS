public class Main {
    public static void main(String[] args) {
      //  Car chevy = new Car();
      //  chevy.color = "black";
      //  chevy.make = "chevy";
      //  chevy.model = "malibu";
        // chevy.year = 2018;

        Car chevy = new Car("Honda", "Pilot", "White", 2017);

        System.out.println(chevy.getColor() + " " + chevy.getMake() + " " + chevy.getModel()+ " " + chevy.getYear());
    }
}