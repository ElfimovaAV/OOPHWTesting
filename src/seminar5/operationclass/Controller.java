package seminar5.operationclass;

import seminar5.baseclass.Student;
import seminar5.baseclass.StudyGroup;
import seminar5.baseclass.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static final StudyGroupService service = new StudyGroupService();

    public static StudyGroup createGroup(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", "Vladimirovich", "Bunin"));
        students.add(new Student("Petr", "Kirillovich", "Stolypin"));
        students.add(new Student("Nikolay", "Grigorievich", "Berezhnoy"));
        students.add(new Student("Evgeniya", "Alekseevna", "Lisichkina"));
        students.add(new Student("Vera", "Antonovna", "Ivanova"));

        return new StudyGroup(1, "mat_meh", new Teacher("Pavel", "Borisovich","Zagorin"), students);
    }

    public static StudyGroup readGroup(String fileName){
        return service.loadGroupFromFile(fileName);
    }

    public static void saveGroup(String fileName, StudyGroup group){
        service.saveGroupToFile(fileName, group);
    }

}
