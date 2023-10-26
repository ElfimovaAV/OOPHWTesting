package seminar4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeachersGroup <T extends Teacher> implements Iterable<Teacher> {
    private String groupName;
    private List<T> teachersList;
    private int index;

    public TeachersGroup (String groupName) {
        this.teachersList = new ArrayList<>();
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void addTeacher(T teacher){
        teachersList.add(teacher);
    }

    public int count() {
        return teachersList.size();
    }

    public T get(Integer index) {
        return teachersList.get(index);
    }

    public TeachersIterator teachersIterator() {
        return new TeachersIterator(teachersList);
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeachersIterator(teachersList);
    }

    private class TeachersIterator implements Iterator<Teacher> {
        private List<T> teachersList;
        private int counter;

        public TeachersIterator(List<T> numberOfTeachers) {
            this.teachersList = numberOfTeachers;
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return index < teachersList.size() - 1;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return teachersList.get(index++);
            }
            return null;
        }

        @Override
        public void remove() {
            teachersList.remove(teachersList.get(index));
        }
    }

}
