package ex03;


import ex03.lib.OuterRabbit;

public class RabbitAdapter extends Animal {
    private OuterRabbit outerRabbit;

    public RabbitAdapter(OuterRabbit outerRabbit) {
        this.outerRabbit = outerRabbit;
    }

    @Override
    public String getName() {
        return outerRabbit.getFullname();
    }
}
