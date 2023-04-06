package OOP.homework;

public class CustomerName {

    private String firstName;
    private String lastName;
    private String middleName;


    //---Constructor----

    public CustomerName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public CustomerName() {
    }

    //---Methods---

    public String getFullName(){
        String result = ("Customer Name: " + firstName + " " + middleName + " " +
                lastName) + "\n";
        return result;
    }

    //---Getters and Setters---

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }



}
