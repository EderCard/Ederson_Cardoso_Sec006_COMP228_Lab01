package ederson_cardoso_exercise1;

public class BasePlusCommissionEmployee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double baseSalary = 200; // Set default value
	private double grossSales;
	private double commissionRate;

	// Constructor with all parameters
	public BasePlusCommissionEmployee(int employeeId, String firstName, String lastName, double baseSalary,
			double grossSales, double commissionRate) {

		// Validate negative value
		if (employeeId < 0) {
			throw new IllegalArgumentException("EmployeeId cannot be negative");
		} else {
			this.employeeId = employeeId;
		}

		// Validate null value for firstName
		if (firstName == null || firstName.isEmpty()) {
			throw new IllegalArgumentException("First name cannot be null");
		} else {
			this.firstName = firstName;
		}

		// Validate null value for lastName
		if (lastName == null || lastName.isEmpty()) {
			throw new IllegalArgumentException("Last name cannot be null");
		} else {
			this.lastName = lastName;
		}

		// Validate negative value for baseSalary
		if (baseSalary < 0) {
			throw new IllegalArgumentException("Salary must be a positive value");
		} else {
			this.baseSalary = baseSalary;
		}

		// Validate negative and minimum value for baseSalary
		if (baseSalary < 0) {
			throw new IllegalArgumentException("Salary must be a positive value");
		} else if (baseSalary < 200) {
			throw new IllegalArgumentException("Salary must be at least $200.00");
		} else {
			this.baseSalary = baseSalary;
		}

		// Validate negative or zero value for grossSales
		if (grossSales <= 0) {
			throw new IllegalArgumentException("Gross Sales must be a positive value");
		} else {
			this.grossSales = grossSales;
		}

		// Validate interval 0.1 to 1.0 for commissionRate
		if (commissionRate < 0.1 || commissionRate > 1.0) {
			throw new IllegalArgumentException("Commission Rate must be betwwen 0.1% and 1.0%");
		} else {
			this.commissionRate = commissionRate;
		}

	}

	// Overloaded constructor
	public BasePlusCommissionEmployee(int employeeId, String firstName, String lastName, double baseSalary) {
		// Validate negative value
		if (employeeId < 0) {
			throw new IllegalArgumentException("EmployeeId cannot be negative");
		} else {
			this.employeeId = employeeId;
		}

		// Validate null value for firstName
		if (firstName == null || firstName.isEmpty()) {
			throw new IllegalArgumentException("First name cannot be null");
		} else {
			this.firstName = firstName;
		}

		// Validate null value for lastName
		if (lastName == null || lastName.isEmpty()) {
			throw new IllegalArgumentException("Last name cannot be null");
		} else {
			this.lastName = lastName;
		}

		// Validate negative and minimum value for baseSalary
		if (baseSalary < 0) {
			throw new IllegalArgumentException("Salary must be a positive value");
		} else if (baseSalary < 200) {
			throw new IllegalArgumentException("Salary must be at least $200.00");
		} else {
			this.baseSalary = baseSalary;
		}

	}

	// This method calculate earnings
	public double earnings(double grossSales, double commissionRate) {
		return baseSalary + commissionRate * grossSales / 100;
	}

	// This method override the default toString method
	@Override
	public String toString() {
		return "CommissionEmployee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", baseSalary=" + baseSalary + ", grossSales=" + grossSales + ", commissionRate=" + commissionRate
				+ ", earnings=" + earnings(grossSales, commissionRate) + "]";

	}

	// Getters and Setters
	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

}
