package task2;

import java.util.Objects;

public class Student {
    private String name;  // variabilă privată
    private Integer year; // variabilă privată

    // Constructor
    public Student(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    // Getter pentru 'name'
    public String getName() {
        return name;
    }

    // Setter pentru 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter pentru 'year'
    public Integer getYear() {
        return year;
    }

    // Setter pentru 'year'
    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getName().equals(student.getName()) && getYear().equals(student.getYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear());
    }
}