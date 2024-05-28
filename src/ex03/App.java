package ex03;

import ex03.lib.OuterRabbit;

public class App {
    public static void main(String[] args) {
        Animal rabbit = new RabbitAdapter(new OuterRabbit());
        Doorman doorman = new Doorman();
        doorman.쫓아내(rabbit);
    }
}
