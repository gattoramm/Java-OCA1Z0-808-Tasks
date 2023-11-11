package part8.exceptions.problems.p14;

class Cargo {}

public class CargoPlane {
    void load(Cargo cargo) throws RuntimeException {
        System.out.println("Cargo loaded - ");
    }

    void fly() {}

    void unload(Cargo cargo) throws Exception {
        System.out.println("Cargo unload - ");
    }

    public static void main(String[] args) throws Exception{
        Cargo cargo = new Cargo();
        CargoPlane plane = new CargoPlane();
        plane.load(cargo);
        plane.fly();
        plane.unload(cargo);
    }
}
