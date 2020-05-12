import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner scan = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        int pesel;

        System.out.println("Podaj dane osobowe");

        System.out.print("Imię: ");
        firstName = scan.nextLine();
        System.out.print("Nazwisko: ");
        lastName = scan.nextLine();


        System.out.print("Wiek: ");
        age = scan.nextInt();
        System.out.print("Pesel: ");
        pesel = scan.nextInt();

        Person person = new Person(firstName, lastName, age, pesel);
        System.out.println(person.toString());

    }
}
