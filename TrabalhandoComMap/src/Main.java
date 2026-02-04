import domain.User;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();
        users.put("joao@joao.com", new User("joao", 22));
        users.put("maria@maria.com", new User("maria", 32));
        users.put("juca@juca.com", new User("juca", 18));
        users.put("leo@leo.com", new User("leo", 40));
        System.out.println(users);
        System.out.println("==========================");
        users.keySet().forEach(System.out::println);
        System.out.println("==========================");
        users.values().forEach(System.out::println);
        System.out.println("==========================");
        //retornar falso pq nao existe esses
        System.out.println(users.containsKey("marcos@marcos.com"));
        System.out.println(users.containsValue(new User("Marcos", 40)));
        //retornar verdadeiro pq existe esses
        System.out.println(users.containsKey("joao@joao.com"));
        System.out.println(users.containsValue(new User("leo", 40)));
        System.out.println("==========================");
        System.out.println(users.remove("joao@joao.com", new User("joao", 22)));
        System.out.println("==========================");
        users.replace("juca@juca.com", new User("juca", 67));
        users.forEach((k, v) -> System.out.printf("Key: %s | value %s \n", k, v));
        System.out.println("==========================");
        System.out.println(users.get("juca@juca.com"));
        System.out.println("==========================");
        users.putIfAbsent("", new User("", -1));
        System.out.println(users);
    }
}