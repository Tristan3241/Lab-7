import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType> {
	Stack<PatientType> stack;
	public StackHospital() {
		stack = new Stack<PatientType>();
	}
	/**
	 * Add a patient to the Hospital.
	 * @param patient - The patient to be added.
	 */
	@Override
	public void addPatient(PatientType patient) {
		stack.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		
		return stack.lastElement();
	}

	@Override
	public PatientType treatNextPatient() {
		return stack.pop();
	}

	@Override
	public int numPatients() {
		return stack.size();
	}

	@Override
	public String hospitalType() {
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}

	@Override
	public String allPatientInfo() {
		return stack.toString();
		
	}
		
	}

