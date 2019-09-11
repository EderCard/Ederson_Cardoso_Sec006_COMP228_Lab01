package Ederson_Cardoso_Exercise1;

public class EmployeeTest {

	public static void main(String[] args) {
		
		/*
		CommissionEmployee emp1 = new CommissionEmployee(1, "Ederson", "Cardoso", 1500.0, .5);
		System.out.println(emp1.toString());
		
		CommissionEmployee emp2 = new CommissionEmployee(2, "John", "Doe", 2500.0);
		System.out.println(emp2.toString());
		
		CommissionEmployee emp3 = new CommissionEmployee(3, "Rose", "Smith", -1000.0, .2);
		System.out.println(emp3.toString());
		*/
		
		BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(4, "Rose", "Smith",  1000.0, .5);
		System.out.println(emp4.toString());
	}

}
