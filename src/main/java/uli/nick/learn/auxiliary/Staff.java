package uli.nick.learn.auxiliary;

import java.util.ArrayList;
import java.util.List;

public class Staff implements Comparable<Staff> {
    private static final List<Staff> staff = new ArrayList<>(List.of(
            new Staff(12, "Sidorov", "Ivan", 'M', "justice", 80000),
            new Staff(13, "Sidorov", "Igor", 'M', "justice", 80000),
            new Staff(36, "Lebedeva", "Irina", 'F', "education", 60000),
            new Staff(20, "Smirnov", "Boris", 'M', "management", 70000),
            new Staff(16, "Danilenko", "Larisa", 'F', "justice", 80000),
            new Staff(33, "Ezhov", "Ivan", 'M', "education", 90000),
            new Staff(18, "Fomina", "Mariya", 'F', "justice", 75000),
            new Staff(29, "Ezhova", "Lidiya", 'F', "management", 85000),
            new Staff(31, "Abramova", "Olga", 'F', "education", 65000),
            new Staff(21, "Lapin", "Roman", 'M', "management", 75000)
    ));

    private final int id;
    private final String surname;
    private final String name;
    private final char gender;
    private final String department;
    private final int salary;

    public Staff(int id, String surname, String name, char gender, String department, int salary) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.salary = salary;
    }

    public static List<Staff> getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        return "(" + id +
                ")" + surname +
                " " + name +
                " " + gender +
                " " + department +
                " " + salary;
    }

    @Override
    public int compareTo(Staff o) {
        return Integer.compare(this.id, o.id);
    }
}
