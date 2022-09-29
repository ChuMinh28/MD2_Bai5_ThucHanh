package bai5;

public class Main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Minh");
        Student s2 = new Student(222,"Linh");
        Student s3 = new Student(333,"Mai");

        s1.display();
        s2.display();
        s3.display();
    }
}
