public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private int salary;
    private int ID;

    public Employee(String firstName, String lastName, int age, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }
}
