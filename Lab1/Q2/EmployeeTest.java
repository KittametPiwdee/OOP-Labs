
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kittamet", "Piwdee", 20000);
        
        // Print e1
        System.out.println("First Name : " + e1.getFirstName());
        System.out.println("Last Name : " + e1.getLastName());
        System.out.println("Monthly Salary : " + e1.getMonthlySalary() + " Baht");
        
        System.out.println("===================================================");
        
        // set e1
        e1.setFirstName("Najeehan");
        e1.setLastName("Panuwat");
        e1.setMonthlySalary(12000);
        
        // print yearly salary e2,e3
        Employee e2 = new Employee("Kamen", "Gunduz", 18000);
        Employee e3 = new Employee("Soranun", "Chumchart",17000);
        
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " Yearly Salary : " + e2.getYearlySalary() + " Baht");
        System.out.println(e3.getFirstName() + " " + e3.getLastName() + " Yearly Salary : " + e3.getYearlySalary() + " Baht");

        System.out.println("===================================================");

        e2.raiseSalary();
        e3.raiseSalary();

        // print raise yearly salary e2.e3
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " Raised Yearly Salary : "+ e2.getYearlySalary() + " Baht");
        System.out.println(e3.getFirstName() + " " + e3.getLastName() + " Raised Yearly Salary : "+ e3.getYearlySalary() + " Baht");

    }
}
