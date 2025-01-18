package task2;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;            // variabilă privată
    private String description;      // variabilă privată
    private List<Student> students;  // variabilă privată

    // Constructor
    public Course(String title, String description) {
        this.title = title;
        this.description = description;
        this.students = new ArrayList<>();
    }

    // Getter pentru 'title'
    public String getTitle() {
        return title;
    }

    // Setter pentru 'title'
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter pentru 'description'
    public String getDescription() {
        return description;
    }

    // Setter pentru 'description'
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter pentru 'students'
    public List<Student> getStudents() {
        return students;
    }

    // Setter pentru 'students'
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Metodă pentru a adăuga un student
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Metodă pentru a filtra studenții după anul dat
    public List<Student> filterYear(int year) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getYear().equals(year)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }
}