package ex02;

public class App {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Tiger tiger = new Tiger();
        DoormanProxy2 doorman = new DoormanProxy2(new Doorman());
        doorman.쫓아내(mouse);
        doorman.쫓아내(tiger);
    }
}
