public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Kittamet", "Piwdee",20000);
        Employee e2 = new Employee("Kamen", "Gunduz",18000);

        //Print e1
        System.out.println("First Name : "+e1.getFirstName());
        System.out.println("Last Name : "+e1.getLastName());
        System.out.println("Monthly Salary : "+e1.getMonthlySalary()+" Baht");

        System.out.println();

        //set e1
        e1.setFirstName("Najeehan");
        e1.setLastName("Panuwat");
        e1.setMonthlySalary(12000);

        //print yearly salary e1,e2
        System.out.println(e1.getFirstName()+" "+e1.getLastName()+" Yearly Salary : "+e1.getYearlySalary()+" Baht");
        System.out.println(e2.getFirstName()+" "+e2.getLastName()+" Yearly Salary : "+e2.getYearlySalary()+" Baht");

        System.out.println();

        e1.raiseSalary();
        e2.raiseSalary();

        //print raise yearly salary e1.e2
        System.out.println(e1.getFirstName()+" "+e1.getLastName()+" Raised Yearly Salary : "+e1.getYearlySalary()+" Baht");
        System.out.println(e2.getFirstName()+" "+e2.getLastName()+" Raised Yearly Salary : "+e2.getYearlySalary()+" Baht");

    }
}
