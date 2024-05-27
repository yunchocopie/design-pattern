package ex00;


/**
 * 목표 : 다형성, 동적바인딩
 * 1. 소나타 (오브젝트 == 객체), 제네시스 (오브젝트 == 객체) == 자동차 (추상)
 */

abstract class Car { // new x
    abstract void run();
}

class Sonata extends Car {
    @Override // 재정의
    void run() {
        System.out.println("소나타 달린다.");
    } // sonata -> car

}

class Genesis extends Car {
    @Override
    void run() {
        System.out.println("제네시스 달린다.");
    } // genesis -> car

}

public class Mem02 {
    public static void main(String[] args) {
        Car s = new Sonata(); // 메모리 sonata(run), car(run)
        s.run(); // car의 run을 호출하러 갔더니, sonata가 run을 재정의해서 car의 run이 오버라이드(무효화) 되고 sonata의 run이 호츌된다. ==> 동적바인딩
        Car g = new Genesis(); // 메모리 genesis(run), car(run)
    }
}
