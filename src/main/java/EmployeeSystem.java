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

    public void increaseSalaryOfAllEmployeesByPercent(double percentage) {
        for (int i=0; i<listOfEmployees.toArray().length; i++){
            Employee employee = listOfEmployees.get(i); //hämta varje anställda
            double newSalary = employee.getSalary() + employee.getSalary() * percentage / 100;
            employee.setSalary(newSalary);
        }
    }
}
