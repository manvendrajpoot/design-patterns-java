package main.java.org.manvendra.Basics.UML;

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Teacher {
    private String name;

    Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teach(Student student) {
        System.out.println(name + " teaches " + student.getName() + " the Sanskrit!");
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Miss Rekha");
        Student student = new Student("Rahul");

        //Association b/w teacher & student
        teacher.teach(student);
    }
}
