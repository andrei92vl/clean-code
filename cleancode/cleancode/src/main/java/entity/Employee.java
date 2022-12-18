package entity;


public class Employee {

    //private String firstName;
    //private String lastName;
    private Address address;


    private FullName fullName;

   /* public String getFirstName() {
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
*/

    public Employee(String firstName, String lastName){

        fullName = new FullName(firstName,lastName);
    }


    public FullName getFullName() {
        return fullName;
    }

    public String getFirstName() { return fullName.getFirstName();}

    public String getLastName() { return fullName.getLastName();}

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
