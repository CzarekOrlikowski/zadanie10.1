import java.util.Scanner;

public class PersonCreation {

    public Person personBuilder() throws NameUndefinedException, IncorrectAgeException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dane osobowe");

        String firstName;
        String lastName;

        System.out.print("Imię: ");
        firstName = scan.nextLine();
        System.out.print("Nazwisko: ");
        lastName = scan.nextLine();
        if (firstName.length() <= 2 || lastName.length() <= 2) {
            throw new NameUndefinedException("Zbyt mało znaków dla imienia/nazwiska, minimum 3");
        }

        int age;
        int pesel;

        System.out.print("Wiek: ");
        age = scan.nextInt();
        System.out.print("Pesel: ");
        pesel = scan.nextInt();
        if (age < 1) {
            throw new IncorrectAgeException("Zbyt mały wiek, minimum 1");
        }
        return new Person(firstName, lastName, age, pesel);
    }
}