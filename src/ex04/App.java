package ex04;


public class App {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Doorman doorman = Doorman.instance;
        Doorman doorman2 = Doorman.getInstance();
        doorman.쫓아내(tiger);
    }
}
