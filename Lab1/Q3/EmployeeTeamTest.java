public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee Sorn = new Employee("Soranun", "Chumchart",17000);
        Employee Ashan = new Employee("Tanawat", "Yukuntarapirak", 16000);
        EmployeeTeam Alpha = new EmployeeTeam(Sorn, Ashan);
        Alpha.printEmployeeDetails();
        System.out.println("=====================================");
        Alpha.printAllEmployeesDetails();
        System.out.println("=====================================");
        Alpha.updateSalaryOfEmployee("Soranun", 18000);
        Alpha.updateSalaryOfEmployee("Tanawat", 16500);
        Alpha.printAllEmployeesDetails();
        System.out.println("======================================");
        Alpha.giveRaiseToAllEmployees();
        Alpha.printAllEmployeesDetails();
    }

    
}
