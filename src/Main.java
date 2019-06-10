public class Main {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Person person = new Person();

       person.add();


        System.out.println(person.getFirstName() + " " + person.getLastname() + " " + person.getAge() + " " + person.getPesel());

    }
}
