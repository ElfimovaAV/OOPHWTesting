package seminar5;

import seminar5.baseclass.Student;
import seminar5.baseclass.StudyGroup;

import java.util.List;

public class StudyGroupService {

    public StudyGroup createStudyGroup (Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}
