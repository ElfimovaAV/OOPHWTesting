package seminar5.baseclass;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudyGroup implements Serializable {
    private int groupNumber;
    private String name;
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(int groupNumber, String name, Teacher teacher, List<Student> students) {
        this.groupNumber = groupNumber;
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public StudyGroup(int groupNumber, String name) {
        this(groupNumber, name, null, new ArrayList<>());
    }

    public StudyGroup(int groupNumber) {
        this(groupNumber, "");
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(Student student){
        students.remove(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void deleteStudent(int position){
        students.remove(position);
    }

    @Override
    public String toString() {
        return "Группа №" + groupNumber +
                ", название: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyGroup group = (StudyGroup) o;
        return groupNumber == group.groupNumber && Objects.equals(name, group.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupNumber, name);
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int groupNumber() {
        return this.groupNumber;
    }


    public void setGroupNo(int groupNumber) {
        this.groupNumber = groupNumber;
    }

}
