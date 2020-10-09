package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student student1 = new Student(111,"hoang");
        Student student2 = new Student(222,"ngyen");
        Student student3 = new Student(333,"hieu");

        student1.display();
        student2.display();
        student3.display();

    }
}
