package day29interfacemanupilations;

public class Tesla extends ElectricalVehicles {


    @Override
    public void climateAc() {
        System.out.println("The Tesla AC presents.. ");
    }

    @Override
    public void run() {
        System.out.println("Tesla run performance..");
    }
}