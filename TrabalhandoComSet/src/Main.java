import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId).reversed());
        /*
        Comparar um cenário especifico
        Set<User> users = new TreeSet<>((User u1, User u2) ->{

            var compareResult = 0;
            if(u1.getId() > u2.getId()) compareResult--;
            if(u1.getId() < u2.getId()) compareResult++;
            return compareResult;
        });
        */
        //Set<User> users = new HashSet<>();
        users.add(new User(1, "Jão"));
        users.add(new User(2, "Maria "));
        users.add(new User(3, "Juca"));
        users.add(new User(4, "Leo"));

        /*
        System.out.println(users.contains(new User(1, "Jão")));
        users.removeIf(user -> user.getId() > 2);
        users.forEach(System.out::println);
        */


    }
}