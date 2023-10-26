package seminar5.operationclass;

import seminar5.baseclass.StudyGroup;

import java.io.*;
import java.util.logging.Logger;

public class StudyGroupService {

    public StudyGroupService() {
    }
    public String saveGroupToFile(String fileName, StudyGroup group){
        String result = "Saved to a file";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(group);
            outputStream.close();
        } catch (IOException e) {
            result = e.getMessage();
        }
        Logger logger = Logger.getAnonymousLogger();
        logger.info(result);

        return result;
    }

    public StudyGroup loadGroupFromFile(String fileName){
        StudyGroup group;
        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            group = (StudyGroup) inputStream.readObject();
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            Logger logger = Logger.getAnonymousLogger();
            logger.info(e.getMessage());
            group = null;
        }

        return group;
    }

}
