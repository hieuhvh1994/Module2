import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<User> NAM = new LinkedList<User>();
        Queue<User> NU = new LinkedList<User>();

        ArrayList<User> p = new ArrayList<User>();

        User u1 = new User("Hoang", "Nam", 19);
        User u2 = new User("Hien", "Nu", 20);
        User u3 = new User("Thai", "Nam", 21);
        User u4 = new User("Hung", "Nam", 22);
        User u5 = new User("Thao", "Nu", 23);
        User u6 = new User("Minh", "Nam", 24);

        p.add(u1);
        p.add(u2);
        p.add(u3);
        p.add(u4);
        p.add(u5);
        p.add(u6);

        for (User a: p) {
            if (a.getSex().equals("Nam")) {
                NAM.add(a);
            } else if (a.getSex().equals("Nu")) {
                NU.add(a);
            }
        }

        ArrayList<User> output = new ArrayList<User>();

        if (NU.isEmpty() == false) {
            for (User nu: NU) {
                output.add(nu);
            }
        }

        if (NAM.isEmpty() == false) {
            for (User nam: NAM) {
                output.add(nam);
            }
        }

        System.out.println(output);



    }
}
