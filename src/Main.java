public class Main {
    public static void main(String[] args) {
      //  Car chevy = new Car();
      //  chevy.color = "black";
      //  chevy.make = "chevy";
      //  chevy.model = "malibu";
        // chevy.year = 2018;

        Car Honda = new Car("Honda", "Pilot", "White", 2017);

        System.out.println(Honda.getColor() + " " + Honda.getMake() + " " + Honda.getModel()+ " " + Honda.getYear());
    }
}