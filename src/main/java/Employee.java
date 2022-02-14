public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Employee(String firstName, String lastName, int age, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
