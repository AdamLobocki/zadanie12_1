import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastname;
    private int age;
    private String pesel;

    Scanner scanner = new Scanner(System.in);

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void add() throws NameUndefinedException, IncorrectAgeException {
        System.out.println("Podaj imie");
        firstName = scanner.nextLine();
        if(firstName == null || firstName.length() <= 2){
            throw new NameUndefinedException("Imię powinn0 miec minimum 3 znaki.\"");
        }
        System.out.println("Podaj nazwisko");
        lastname = scanner.nextLine();
        if (lastname == null || lastname.length() <= 2){
            throw new NameUndefinedException("Nazwisko powinno miec minimum 3 znaki.");
        }
        System.out.println("Podaj wiek");
        age = scanner.nextInt();
        if( age < 1){
            throw new IncorrectAgeException("Wiek nie może być poniżej roku.");
        }
        scanner.nextLine();
        System.out.println("Podaj pesel");
        pesel = scanner.nextLine();



    }







}
