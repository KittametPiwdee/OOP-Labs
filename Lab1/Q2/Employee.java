public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String fName, String lName, double salary) {
        this.firstName = fName;
        this.lastName = lName;
        if (salary > 0) {
            this.monthlySalary = salary;
        }else{
            this.monthlySalary = 0;
        }
    }

    public Employee(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
        this.monthlySalary = 0;
    }

    public void setFirstName(String fName) {
        this.firstName = fName;
    }

    public void setLastName(String lName) {
        this.lastName = lName;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0) {
            this.monthlySalary = salary;
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
