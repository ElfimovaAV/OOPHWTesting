package seminar5;

import seminar5.baseclass.StudyGroup;
import seminar5.operationclass.Controller;


public class Main {
    public static void main(String[] args) {

        StudyGroup group = Controller.createGroup();

        Controller.saveGroup("group.txt", group);

        StudyGroup newGroup = Controller.readGroup("group.txt");

    }
}
