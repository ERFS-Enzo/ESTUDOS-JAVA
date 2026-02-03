import java.util.List;
import java.util.function.Function;
//import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<User> users = List.of(new User("Maria", 21),
                new User("João", 32),
                new User("Eduardo", 40),
                new User("Ana", 19));
        /*
        Forma tradicional (classe anônima)
            Consumer consumer = new Consumer<User>(){

                @Override
                public void accept(final User user){
                    System.out.println(user);
                }
            };
        */

        //forma com lambda
        //users.forEach(user -> System.out.println(user));
        //printStringValue(User::name, users);
        /*
        printStringValue(user -> user.name(), users);
        printStringValue(user -> String.valueOf(user.age()), users);
        printStringValue(user -> user.toString(), users);
        */
        printStringValue(Record::toString, users);

    }
    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }


}