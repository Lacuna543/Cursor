package cursor_homework;


public class Test {
    public static void main(String[] args) {
        F_14 plane1 = new F_14();
        Su_15 plane2 = new Su_15();
        plane1.startEngine(plane1.getEnginesType(), plane1.getEngineCapacity());
        plane1.startAttack(plane1.getNumberOfRockets());
        plane2.startAttack(plane2.getNumberOfRockets() / 2);
        plane2.flyUp();
        plane1.describeEngine();
        plane2.landing();
        plane1.showInfo();
    }
}

