package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;

public class App {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        jt.수업하기();

        System.out.println();

        PythonTeacher pt =  new PythonTeacher();
        pt.수업하기();

        System.out.println();

        HtmlTeacher ht = new HtmlTeacher();
        ht.수업하기();
    }
}