package ederson_cardoso_exercise1;

public class CommissionEmployee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double grossSales;
	private double commissionRate = 0.1; // Set default value

	// Constructor with all parameters
	public CommissionEmployee(int employeeId, String firstName, String lastName, double grossSales,
			double commissionRate) {

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

	// Overloaded constructor without grossSales and commissionRate public
	public CommissionEmployee(int employeeId, String firstName, String lastName) {

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

	}

	// This method calculate earnings
	public double earnings(double grossSales, double commissionRate) {
		return commissionRate * grossSales / 100;
	}

	// This method override the default toString method
	@Override
	public String toString() {
		return "CommissionEmployee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", earnings="
				+ earnings(grossSales, commissionRate) + "]";

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
