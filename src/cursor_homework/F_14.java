package cursor_homework;

public class F_14 extends Destroyer {
    public F_14(){
        setEngineCapacity(9500);
        setEnginesType("Pratt & Whitney F100");
        setFlightAltitude(11750);
        setSpeed(2655);
        setName("F-15");
        setNumberOfRockets(16);
    }

    public void flyUp(){
        System.out.println(getName() + "fly up with max flight altitude " + getFlightAltitude() + " with " + getSpeed() + " speed.");
    }

    public void startAttack(int numberOfRockets) {
        System.out.println("Attacked right wing: sent all " + numberOfRockets + " rocket");
    }
    public void landing(){
        System.out.println(getName() + " is landing.");
    }

}
