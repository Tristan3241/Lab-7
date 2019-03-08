
public class SickPerson extends Person{
	
	private int severity;

	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
		// TODO Auto-generated constructor stub
	}

	private int getSeverity() {
		return severity;
	}
	@Override
	protected int compareToImpl(Person p) {
		if(this.getSeverity() < ((SickPerson) p).getSeverity()) {
			return 1;
		} else if (this.getSeverity() > ((SickPerson) p).getSeverity()) {
			return -1;
		} else {
			return 0;
		}

	}
	@Override
	public String toString() {
		return String.format("%s Severity level %d",this.getName(),this.getSeverity());
	}
}
