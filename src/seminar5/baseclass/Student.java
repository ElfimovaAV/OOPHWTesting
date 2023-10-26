package seminar5;

import seminar5.Human;

import java.io.Serializable;

public class Student extends Human, Serializable {
    protected Student(String name, String patronymic, String surname) {
        super(name, patronymic, surname);
    }

    @Override
    public String toString() {
        return  "EnglishTeacher: " +
                "name:'" + name + '\'' +
                ", patronymic:'" + patronymic + '\'' +
                ", surname='" + surname + '\'';
    }
}
