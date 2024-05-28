package ex04.teacher;

public abstract class Teacher {
    public void 수업하기() {
        입장하기();
        출석부르기();
        강의하기();
        퇴장하기();
    }

    void 입장하기() {
        System.out.println("입장하기");
    }

    void 출석부르기() {
        System.out.println("출석부르기");
    }

    abstract void 강의하기();

    void 퇴장하기() {
        System.out.println("퇴장하기");
    }
}
