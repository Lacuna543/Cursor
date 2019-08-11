package cursor_homework;

public class Su_15 extends Destroyer {
    public Su_15() {
        setEngineCapacity(8675);
        setEnginesType("Р-11-30");
        setFlightAltitude(11750);
        setSpeed(1750);
        setName("Su-15");
        setNumberOfRockets(8);
    }

    public void flyUp(){
        System.out.println(getName() + "fly up");
    }

    public void startAttack(int numberOfRockets) {
        System.out.println("Attacked right wing: sent " + numberOfRockets + " rocket");
    }
    public void landing(){
        System.out.println(getName() + " is landing.");
    }

}
