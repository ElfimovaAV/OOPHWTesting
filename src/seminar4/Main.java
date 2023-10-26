package seminar4;


public class Main {
    public static void main(String[] args) {
        TeachersGroup<Teacher> teachers = new TeachersGroup<>("teachers");
        teachers.addTeacher(new MathTeacher("Петр", "Васильевич", "Кораблев"));
        teachers.addTeacher(new MathTeacher("Лариса", "Андреевна", "Почалкина"));
        teachers.addTeacher(new EnglishTeacher("Борис", "Федорович", "Земкин"));
        teachers.addTeacher(new EnglishTeacher("Мария", "Кирилловна", "Пономарева"));


        for(
                int index = 0; index<teachers.count();index++)

        {
            System.out.println(teachers.get(index));
        }
    }
}
