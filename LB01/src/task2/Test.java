package task2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Crearea a două obiecte Student cu aceleași date
        Student student1 = new Student("Ion Popescu", 1);
        Student student1Duplicate = new Student("Ion Popescu", 1);
        Student student2 = new Student("Ana Ionescu", 2);
        Student student3 = new Student("Andrei Vasile", 3);
        Student student4 = new Student("Alexandru Dumitrescu", 4);
        Student student5 = new Student("Ioana Gheorghe", 1);
        Student student6 = new Student("Alina Munteanu", 2);

        // Compararea obiectelor folosind equals()
        System.out.println("student1.equals(student1Duplicate): " + student1.equals(student1Duplicate));
        System.out.println("student1.equals(student2): " + student1.equals(student2));

        // Crearea cursului
        Course course = new Course("Informatica", "Curs de bază în informatică");

        // Adăugarea studenților la curs
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);
        course.addStudent(student4);
        course.addStudent(student5);
        course.addStudent(student6);

        // Afișarea studenților din anul dat
        System.out.println("Studenți din anul " + 2 + ": ");
        System.out.println(Arrays.toString(course.filterYear(2).toArray()));

    }
}