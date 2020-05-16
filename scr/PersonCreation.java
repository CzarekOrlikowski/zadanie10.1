import java.util.Scanner;

public class PersonCreation {

    public Person personBuilder() throws NameUndefinedException, IncorrectAgeException {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dane osobowe");

        System.out.print("Imię: ");
        String firstName = scan.nextLine();
        System.out.print("Nazwisko: ");
        String lastName = scan.nextLine();
        if (firstName.length() <= 2 || lastName.length() <= 2) {
            throw new NameUndefinedException("Zbyt mało znaków dla imienia/nazwiska, minimum 3");
        }

        System.out.print("Wiek: ");
        int age = scan.nextInt();
        System.out.print("Pesel: ");
        int pesel = scan.nextInt();
        if (age < 1) {
            throw new IncorrectAgeException("Zbyt mały wiek, minimum 1");
        }
        return new Person(firstName, lastName, age, pesel);
    }
}