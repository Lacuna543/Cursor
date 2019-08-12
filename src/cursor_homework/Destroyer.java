package cursor_homework;

public class Destroyer implements Info{
    private int speed;
    private int flightAltitude;
    private int numberOfRockets;
    private int engineCapacity;
    private String enginesType;
    private String name;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFlightAltitude() {
        return flightAltitude;
    }

    public void setFlightAltitude(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }

    public int getNumberOfRockets() {
        return numberOfRockets;
    }

    public void setNumberOfRockets(int numberOfRockets) {
        this.numberOfRockets = numberOfRockets;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getEnginesType() {
        return enginesType;
    }

    public void setEnginesType(String enginesType) {
        this.enginesType = enginesType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void flyUp(){
        System.out.println("Destroyer fly up.");
    }

    public void startAttack() {
        System.out.println("Destroyer sent rockets");
    }

    public void landing(){
        System.out.println("Destroyer is landing.");
    }

    public void startEngine(String enginesType, int engineCapacity){
        System.out.println("Started engine " + enginesType + " with " + engineCapacity + " capacity.");
    }

    @Override
    public void showInfo() {
        System.out.println("Hey, this is info");
    }
}
