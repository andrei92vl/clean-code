package entity;

public class FullName {

    private final String firstName;
    private final String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String asCorporateName(){
        return firstName + " " + lastName.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
