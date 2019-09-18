package ederson_cardoso_exercise1;

public class EmployeeTest {

	public static void main(String[] args) {
		System.out.println("---CommisssionEmployee Test---");
		// Default constructor with all arguments
		CommissionEmployee emp1 = new CommissionEmployee(1, "Ederson", "Cardoso", 1500.0, .5);
		System.out.println(emp1.toString());

		// Overloaded constructor that returns default value (0.1) for commissionRate
		CommissionEmployee emp2 = new CommissionEmployee(2, "John", "Doe");
		System.out.println(emp2.toString());

		System.out.println();
		// *************************************************************************************
		System.out.println("---BasePluCommissionEmployee Test---");
		// Default constructor with all arguments
		BasePlusCommissionEmployee emp3 = new BasePlusCommissionEmployee(3, "Rose", "Smith", 500.00, 1000.0, 0.5);
		System.out.println(emp3.toString());

		// Overloaded constructor
		BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(4, "Will", "Iam", 200);
		System.out.println(emp4.toString());

		System.out.println();
		// *************************************************************************************
		System.out.println("---HourlyEmployee Test---");
		HourlyEmployee emp5 = new HourlyEmployee(5, "Samantha", "Care", 40.0, 16.0);
		System.out.println(emp5.toString());

		HourlyEmployee emp6 = new HourlyEmployee(6, "Adam", "Sandler");
		System.out.println(emp6.toString());
	}
}
