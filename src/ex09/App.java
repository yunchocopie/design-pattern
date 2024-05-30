package ex09;

import ex09.student.HomeworkDelegator;
import ex09.student.HomeworkType;

/**
 * 델리게이트
 * 개념 : 객체가 자신이 직접 작업을 수행하지 않고 다른 객체에게 위임
 * 쉬운 설명 : 다른 사람에게 일을 맡김
 *
 * 목표 : 작업을 직접 수행하지 않고 그 작업을 위임한다.
 *
 * 작업 순서
 * 1. 규칙을 정한다. -> 어떤 과목인지 어떤 결과를 줘야하는지
 * 2. 학생을 고른다. -> 과학 학생, 수학 학생 등
 * 3. 숙제를 시킨다. -> 숙제를 하라고 한다.
 *
 * 사용 이유
 * 효율적 : 직접 하기보다는 잘하느 인원에게 맡기면 빠르고 정확하기 때문
 * 유연성 : 일이 생기면 바로 맡길 수 있고, 새로운 친구에 맞는 숙제를 맡길 수 있다.
 */
public class App {
    public static void main(String[] args) {
        HomeworkDelegator homeworkDelegator= new HomeworkDelegator();

        // 1. 수학
        homeworkDelegator.delegateHomework(HomeworkType.MATH);

        // 2. 과학
        homeworkDelegator.delegateHomework(HomeworkType.SCIENCE);
    }
}
