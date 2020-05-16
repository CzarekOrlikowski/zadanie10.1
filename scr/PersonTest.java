import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {

        PersonCreation personCreation = new PersonCreation();

        try {
            Person person = personCreation.personBuilder();
            System.out.println(person);
        } catch (NameUndefinedException e) {
            System.err.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
