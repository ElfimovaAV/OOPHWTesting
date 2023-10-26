package seminar4;

public class EnglishTeacher extends Teacher{
    protected EnglishTeacher(String name, String patronymic, String surname) {
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
