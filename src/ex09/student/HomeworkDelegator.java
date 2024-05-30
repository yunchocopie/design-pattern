package ex09.student;

import java.util.ArrayList;
import java.util.List;

public class HomeworkDelegator {
    private final List<Student> students = new ArrayList<Student>();

    // 작업을 위임하기 위해 미리 정의된 학생 객체들을 리스트에 추가
    public HomeworkDelegator() {
        students.add(new MathStudent());
        students.add(new ScienceStudent());
    }

    public void delegateHomework(HomeworkType type) {
        students.stream()
                .filter(student -> student.isSameHomework(type))
                .forEach(student -> student.doHomework());

    }
}
