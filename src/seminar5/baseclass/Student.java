package seminar5.baseclass;

import java.io.Serializable;

public class Student implements Human, Serializable {
    private String name;
    private String patronymic;
    private String surname;

    public Student(String name, String patronymic, String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  "EnglishTeacher: " +
                "name:'" + name + '\'' +
                ", patronymic:'" + patronymic + '\'' +
                ", surname='" + surname + '\'';
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
}
