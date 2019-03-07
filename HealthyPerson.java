/**
 * Specific type of Person admitted to a Hospital. A healthy person.
 * @author Trist
 *
 */
public class HealthyPerson extends Person {

	private String reason;
	/**
	 * 
	 * @param name - the HealthyPerson's name.
	 * @param age - The HealthyPerson's age, in years.
	 * @param reason - The HealthyPerson's reason for visiting the Hospital (e.g. a yearly checkup).
	 */
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
		
	}

	@Override
	protected int compareToImpl(Person p) {
		if(this.getName().compareTo(p.getName()) < 0) {
			return 1;
		} else if (this.getName().compareTo(p.getName()) > 0) {
			return 2;
		} else {
			return 3;
		}
	}
	@Override
	public String toString() {
		return String.format("%s In for %s", this.getName(), this.reason);
	}
}
