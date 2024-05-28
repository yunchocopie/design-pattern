package sample;

/**
 * 상황 : 만보기 라이브러리를 만드는 개발자, 만보기 메서드를 사용하는 프론트 개발자
 * 문제 : 만보기 개발자가 일이 늦어서 30일 걸리고, 나는 10일내로 개발해야 돼요
 * 1. 인터페이스 구현 (메서드 통일) - 만보기(인터페이스)
 */
public class App {
    public static void main(String[] args) {
        MeterService ms = new MeterService(new RealMeter());
        ms.render();
    }
}