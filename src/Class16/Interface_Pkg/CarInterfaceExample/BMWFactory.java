package Class16.Interface_Pkg.CarInterfaceExample;

public class BMWFactory implements CarGuidelines, EnvGuidelines {


    public void addSteeringWheel() {
        System.out.println("Heated Steering wheel");
    }

    public void addEngine() {
        System.out.println("Basic wheel");
    }

    public void addTrunk() {
        System.out.println("Minimum truck space");
    }

    public void addPremiumSeats(int numSeats) {
        System.out.println(numSeats + " seats added");
    }

    public void zeroEmission() {
        System.out.println("Zero emission in 2022 model");
    }
}
