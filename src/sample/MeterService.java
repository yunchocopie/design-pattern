package sample;

public class MeterService {
    private Meter meter;

    public MeterService(Meter meter) {
        this.meter = meter;
    }

    public void render(){
        int step = meter.getStep();
        System.out.println("걸음 수 : "+step);
    }
}