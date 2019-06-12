import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastname;
    private int age;
    private String pesel;



    public String getFirstName() {
        return firstName;
    }


    public String getLastname() {
        return lastname;
    }



    public int getAge() {
        return age;
    }



    public String getPesel() {
        return pesel;
    }


    public void add(String firstN, String lastN, String p, int a) throws NameUndefinedException, IncorrectAgeException {

        firstName = firstN;
        if(firstName == null || firstName.length() <= 2){
            throw new NameUndefinedException("Imię powinno miec minimum 3 znaki.\"");
        }
        lastname = lastN;
        if (lastname == null || lastname.length() <= 2){
            throw new NameUndefinedException("Nazwisko powinno miec minimum 3 znaki.");
        }
        age = a;
        if( age < 1){
            throw new IncorrectAgeException("Wiek nie może być poniżej roku.");
        }
        pesel = p;



    }







}
