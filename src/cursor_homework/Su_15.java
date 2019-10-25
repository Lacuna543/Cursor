package cursor_homework;

public class Su_15 extends Destroyer implements Info{
    public Su_15() {

    }

    public void flyUp(){
        System.out.println(getName() + "fly up.");
    }

    public void startAttack(int numberOfRockets) {
        System.out.println("Attacked right wing: sent " + numberOfRockets + " rocket.");
    }
    public void landing(){
        System.out.println(getName() + " is landing.");
    }

}
