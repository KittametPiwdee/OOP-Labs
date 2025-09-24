public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss,Employee employee){
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployeeDetails(){
        System.out.println("Employee Name : "+employee.getFirstName()+" "+employee.getLastName());
        System.out.println("Employee Salary : "+employee.getMonthlySalary()+" Baht");
    }

    public void printAllEmployeesDetails(){
        System.out.println("Boss Name : "+boss.getFirstName()+" "+boss.getLastName());
        System.out.println("Boss Salary : "+boss.getMonthlySalary()+" Baht");
        System.out.println("Employee Name : "+employee.getFirstName()+" "+employee.getLastName());
        System.out.println("Employee Salary : "+employee.getMonthlySalary()+" Baht");
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary){
        if(newSalary>0){
            if(boss.getFirstName().equals(firstname)){
                boss.setMonthlySalary(newSalary);
            }
            if(employee.getFirstName().equals(firstname)){
                employee.setMonthlySalary(newSalary);
            }
        }
    }

    public void giveRaiseToAllEmployees(){
        boss.raiseSalary();
        employee.raiseSalary();
    }
}
