import model.Group;
import model.Students;
import model.Teams;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Lobutche
        ArrayList<Students> LobuchheStudents = new ArrayList<Students>();
        Students lbc1 = new Students("Arunesh", 23011, 18);
        LobuchheStudents.add(lbc1);
        Students lbc2 = new Students("Biplov", 23018, 17);
        LobuchheStudents.add(lbc2);
        Students lbc3 = new Students("Aswin", 23007, 17);

        //Khumbila
        ArrayList<Students> KhumbilaStudents = new ArrayList<Students>();
        Students kmbl1 = new Students("Saki", 230676, 56);
        KhumbilaStudents.add(kmbl1);
        Students kmbl2 = new Students("Aryan", 12345, 43);
        KhumbilaStudents.add(kmbl2);
        Students kmbl3 = new Students("Sonishma", 12346, 97);

        //Team List
        ArrayList<Teams> TeamLobuchhe = new ArrayList<Teams>();
        Teams  t1 = new Teams(LobuchheStudents, "A");
        TeamLobuchhe.add(t1);

        ArrayList<Teams> TeamKhumbila = new ArrayList<Teams>();
        Teams t2 = new Teams(KhumbilaStudents, "B");
        TeamKhumbila.add(t2);

        //Group List
        Group g1 = new Group("Highschool", TeamLobuchhe);
        Group g2 = new Group("Highschool", TeamKhumbila);
    }
}