import java.util.ArrayList;
import java.util.List;

public class History {
    private static List<PersonBackup> backupList = new ArrayList<>();

    public static void save(Person person){
        PersonBackup backup = new PersonBackup(person);
        backupList.add(backup);
    }

    public static Person restore(){
        Person person = null;
        if(backupList != null){
            int index = backupList.size() - 1;
            person = backupList.get(index - 1).getPerson();
        }
        return person;
    }
}
