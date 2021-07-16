package entity;

import java.util.Objects;

public class Student {

    private final String name;
    private final String surname;
    public int score;

    public Student(String name, String surname, int score) {
        this(name,surname);
        this.score = score;
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return name + " " + surname + ": " + score;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name.toLowerCase(), student.name.toLowerCase()) &&
                Objects.equals(surname.toLowerCase(), student.surname.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
