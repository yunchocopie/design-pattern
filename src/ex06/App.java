package ex06;

import ex06.notification.BasicNotifier;
import ex06.notification.EmailNotifier;
import ex06.notification.Notifier;
import ex06.notification.SmsNotifier;

/**
 * 목표 : 기능확장 (데코레이터 패터) -> 알림 서비스 개발하기
 */

public class App {
    public static void main(String[] args) {
        Notifier no1 = new SmsNotifier(new EmailNotifier());
        no1.send();
    }
}
