package Ederson_Cardoso_Exercise1;

public class HourlyEmployee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double hoursPerWeek;
	private double hourRate;

	// Constructor with all parameters
	public HourlyEmployee(int employeeId, String firstName, String lastName, double hoursPerWeek, double hourRate) {

		// Validate negative value
		if (employeeId < 0) {
			throw new IllegalArgumentException("EmployeeId cannot be negative");
		}
		this.employeeId = employeeId;

		// Validate null value for firstName
		if (firstName == null) {
			throw new IllegalArgumentException("First name cannot be null");
		}
		this.firstName = firstName;

		// Validate null value for lastName
		if (lastName == null) {
			throw new IllegalArgumentException("Last name cannot be null");
		}
		this.lastName = lastName;

		this.hoursPerWeek = hoursPerWeek;

		// Set default value (14) for hourRate
		this.hourRate = hourRate == 0 ? 14 : hourRate;
	}

	// Overloaded constructor
	public HourlyEmployee(int employeeId, String firstName, String lastName) {

		// Validate negative value
		if (employeeId < 0) {
			throw new IllegalArgumentException("EmployeeId cannot be negative");
		}
		this.employeeId = employeeId;

		// Validate null value for firstName
		if (firstName == null) {
			throw new IllegalArgumentException("First name cannot be null");
		}
		this.firstName = firstName;

		// Validate null value for lastName
		if (lastName == null) {
			throw new IllegalArgumentException("Last name cannot be null");
		}
		this.lastName = lastName;

		// Set default value (14) for hourRate
		this.hourRate = hourRate == 0 ? 14 : hourRate;
	}

	// This method calculate earnings
	public double earnings(double hoursPerWeek, double hourRate) {
		return hoursPerWeek * hourRate;
	}

	// This method override the default toString method
	@Override
	public String toString() {
		return "HourlyEmployee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", hoursPerWeek=" + hoursPerWeek + ", hourRate=" + hourRate + ", earnings="
				+ earnings(hoursPerWeek, hourRate) + "]";
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

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
	}

}
