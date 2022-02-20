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
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String myLastName) {
        this.lastName = myLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double mySalary) {
        this.salary = mySalary;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

}
