package main.java.org.manvendra.Basics.UML;

import java.util.Arrays;
import java.util.List;

class Professor {
    private String name;

    Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Professor> professorList;

    Department(String name, List<Professor> pList) {
        this.name = name;
        this.professorList = pList;
    }

    public String getName() {
        return name;
    }

    public List<Professor> getProfessorList() {
        return professorList;
    }

    public void showProfessors() {
        System.out.println("List of Professors in " + name + " department:");
        for (Professor professor: professorList) {
            System.out.println(professor.getName());
        }
    }
}


public class AggregationExample {
    public static void main(String[] args) {
        Professor professor1 = new Professor("MG Das");
        Professor professor2 = new Professor("SD Mitra");

        List<Professor> pList = Arrays.asList(professor1, professor2);
        Department department = new Department("CSE", pList);

        /* Department has professors
            But Professor can also exists independently with a department
         */
        department.showProfessors();
    }
}
