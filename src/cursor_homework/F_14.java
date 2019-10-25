package cursor_homework;

public class F_14 extends Destroyer implements Info{
    public F_14(){

    }

    public void flyUp(){
        System.out.println(getName() + "fly up with max flight altitude " + getFlightAltitude() + " with " + getSpeed() + " speed.");
    }

    public void startAttack(int numberOfRockets) {
        System.out.println("Attacked right wing: sent all " + numberOfRockets + " rocket.");
    }
    public void landing(){
        System.out.println(getName() + " is landing.");
    }

    public void describeEngine(){
        System.out.println(getName() + " has " + getEnginesType() + " engine with " + getEngineCapacity() + " liters.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
