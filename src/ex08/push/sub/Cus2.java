package ex08.push.sub;

public class Cus2 implements Customer {
    @Override
    public void update(String msg) {
        System.out.println("손님2의 받은 알림 : " + msg);
    }
}
