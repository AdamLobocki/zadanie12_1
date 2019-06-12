import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Imię, Nazwisko, pesel oraz wiek");

       person.add(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt());


        System.out.println(person.getFirstName() + " " + person.getLastname() + " " + person.getAge() + " " + person.getPesel());

    }
}
