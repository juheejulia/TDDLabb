public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    private static int IDCounter;
    private int id;

    public Employee(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        IDCounter = IDCounter + 1;
        this.id = IDCounter;
    }

    public void setFirstName(String firstName){
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

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
