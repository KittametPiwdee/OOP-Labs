public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String Fname, String lName, double Salary) {
        this.firstName = Fname;
        this.lastName = lName;
        if (Salary > 0) {
            this.monthlySalary = Salary;
        }else{
            this.monthlySalary = 0;
        }
    }

    public Employee(String Fname, String lName) {
        this.firstName = Fname;
        this.lastName = lName;
        this.monthlySalary = 0;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setMonthlySalary(double Salary) {
        if (Salary > 0) {
            this.monthlySalary = Salary;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void raiseSalary() {
        this.monthlySalary += (this.monthlySalary * 10) / 100;
    }

}
