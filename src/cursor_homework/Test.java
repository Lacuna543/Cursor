package cursor_homework;


public class Test {
    public static void main(String[] args) {
        F_14 plane1 = new F_14();
        Su_15 plane2 = new Su_15();

        plane1.setEngineCapacity(8675);
        plane1.setEnginesType("Р-11-30");
        plane1.setFlightAltitude(11750);
        plane1.setSpeed(1750);
        plane1.setName("Su-15");
        plane1.setNumberOfRockets(8);

        plane2.setEngineCapacity(9500);
        plane2.setEnginesType("Pratt & Whitney F100");
        plane2.setFlightAltitude(11750);
        plane2.setSpeed(2655);
        plane2.setName("F-15");
        plane2.setNumberOfRockets(16);

        plane1.startEngine(plane1.getEnginesType(), plane1.getEngineCapacity());
        plane1.startAttack(plane1.getNumberOfRockets());

        plane2.startAttack(plane2.getNumberOfRockets() / 2);
        plane2.flyUp();
        plane2.landing();

        plane1.describeEngine();
        plane1.showInfo();
    }
}

