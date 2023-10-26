ackage seminar4;

public class MathTeacher extends Teacher{
    protected MathTeacher(String name, String patronymic, String surname) {
        super(name, patronymic, surname);
    }

    @Override
    public String toString() {
        return  "MathTeacher: " +
                "name:'" + name + '\'' +
                ", patronymic:'" + patronymic + '\'' +
                ", surname='" + surname + '\'';
    }
}
