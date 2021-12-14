package Class16.Interface_Pkg.CarInterfaceExample;

public class TeslaFactory implements EnvGuidelines, CarGuidelines {

    public void zeroEmission() {
        System.out.println("Electric cars. hence zero emission from day-1");
    }

    public void addSteeringWheel() {
        System.out.println("Adding basic steering wheel");
    }

    public void addEngine() {
        System.out.println("Basic engine to support electric fuel");
    }

    public void addTrunk() {
        System.out.println("Truck on both sides");
    }

}
