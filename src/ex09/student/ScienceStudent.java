package ex09.student;

public class ScienceStudent implements Student{
    @Override
    public void doHomework() {
        System.out.println("과학 숙제를 합니다.");
    }

    @Override
    public boolean isSameHomework(HomeworkType homeworkType) {
        return HomeworkType.SCIENCE.equals(homeworkType);
    }
}
