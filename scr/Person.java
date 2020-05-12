public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {
        if (firstName.length() < 2 || lastName.length() < 2) {
            throw new NameUndefinedException("Zbyt mało znaków, minimum 3");
        } else {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        if (age < 1) {
            throw new IncorrectAgeException("Zbyt mały wiek, minimum 1");
        } else {
            this.age = age;
            this.pesel = pesel;
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String toString() {
        return "DANE OSOBOWE" + " \n" +
                "imię: " + firstName + " \n" +
                "nazwisko: " + lastName + " \n" +
                "wiek: " + age + " \n" +
                "pesel: " + pesel + " \n";
    }
}
