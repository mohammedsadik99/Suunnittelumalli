package Composite;

public class Main {
    public static void main(String[] args) {


        Employee emp1 = new Employee("mohammed sadik", 40000);
        Employee emp2 = new Employee("ismo laitela", 60000);
        Employee emp3 = new Employee("kukka sipuli", 50000);

        Department dep1 = new Department("Logistics");
        Department dep2 = new Department("Marketing");
        Department dep3 = new Department("Delivery");

        dep1.add(emp1);
        dep1.add(emp2);
        dep2.add(emp3);

        Department company = new Department("Company");
        company.add(dep1);
        company.add(dep2);
        company.add(dep3);


        System.out.println("Total Salary of the Organization: $" + company.getSalary());

        System.out.println("\nOrganization Structure:");
        company.printStructure("");

        System.out.println("\nOrganization Structure in XML Format:");
        company.printXML("");

    }

}