import java.util.ArrayList;

public class EmployeeSystem {

    private ArrayList<Employee> listOfEmployees = new ArrayList<>();

    public void addEmployee(Employee newEmployee) {
        this.listOfEmployees.add(newEmployee);

    }

    public ArrayList<Employee> getListOfEmployees() {
        return this.listOfEmployees;

    }

    public void removeEmployee(Employee newEmployee) {
        listOfEmployees.remove(newEmployee);
    }
}
