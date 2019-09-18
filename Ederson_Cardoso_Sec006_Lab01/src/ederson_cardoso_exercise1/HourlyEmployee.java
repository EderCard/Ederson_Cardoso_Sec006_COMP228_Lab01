package ederson_cardoso_exercise1;

public class HourlyEmployee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private double hoursPerWeek;
	private double hourRate = 14; // Set default value

	// Constructor with all parameters
	public HourlyEmployee(int employeeId, String firstName, String lastName, double hoursPerWeek, double hourRate) {

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

		setHoursPerWeek(hoursPerWeek);

		setHourRate(hourRate);
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
		// Validate negative value
		if (hoursPerWeek < 0) {
			throw new IllegalArgumentException("Hours per week cannot be negative");
		} else {
			this.hoursPerWeek = hoursPerWeek;
		}
	}

	public double getHourRate() {
		return hourRate;
	}

	public void setHourRate(double hourRate) {
		// Validate minimum value (14)
		if (hourRate < 14) {
			throw new IllegalArgumentException("Hour rate must be at least $14.00 per hour");
		} else {
			this.hourRate = hourRate;
		}
	}

}
