package seminar4;

abstract class Teacher {
    String name;
    String patronymic;
    String surname;

    protected Teacher(String name, String patronymic, String surname) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String getName() {return name;}

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public String toString() {
        return "Teacher: " +
                "name:'" + name + '\'' +
                ", patronymic:'" + patronymic + '\'' +
                ", surname='" + surname + '\'';
    }
}
