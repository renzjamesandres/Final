/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package school;

/**
 *
 * @author renzj
 */
import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Class> classes;

    public School(String name) {
        this.name = name;
        this.classes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void addClass(Class schoolClass) {
        classes.add(schoolClass);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mr. Smith", 1, "Math");
        Teacher teacher2 = new Teacher("Ms. Johnson", 2, "English");

        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");

        Class class1 = new Class("Math 101", teacher1);
        class1.addStudent(student1);
        class1.addStudent(student2);

        School school = new School("Greenwood High");
        school.addClass(class1);

        System.out.println(school);
    }
}
