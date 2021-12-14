package Class17.LabSessionPkg;

public abstract class GuidelinesForMobile {

    /*
        normal method

        abstract method
     */

    // should be able to call
    public abstract void makeCall();

    // should have rechargeable battery
    public abstract void addBattery();

    // should be have to send text msg
    public abstract void sendTextMsg();

    // add tracking system
    public void trackDevice() {
        System.out.println("Tracking system added");
    }


}
