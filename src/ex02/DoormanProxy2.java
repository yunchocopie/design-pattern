package ex02;

public class DoormanProxy2{

    private Doorman doorman;

    public DoormanProxy2(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫓아내(Animal a) {
        System.out.println("지갑 검사");
        doorman.쫓아내(a);
    }
}
