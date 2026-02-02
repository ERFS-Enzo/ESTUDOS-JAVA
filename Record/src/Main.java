//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var person = new Person("Enzo", 18);
        System.out.println(person);
        System.out.println(person.name());

        //nao da pra alterar valores de um objeto record
    }
}