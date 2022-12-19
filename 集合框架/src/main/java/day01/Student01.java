package day01;

import java.util.Objects;

public class Student01 {
    private String name;
    private String number;

    public Student01(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student01 student01 = (Student01) o;
        return Objects.equals(name, student01.name) &&
                Objects.equals(number, student01.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number);
    }

    @Override
    public String toString() {
        return "Student01{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
