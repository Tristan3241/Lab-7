import java.util.PriorityQueue;
/**
 * Class representing a Hospital that orders its patients in the following way:Patients are ordered via a PriorityQueue. 
 * That is, the first patient admitted is the first to be treated.However, if patients have some natural ordering, 
 * then this is used to give a priority to patients.
 * For example, the SickPerson has a severity level and implements the comparable interface to allow SickPersonsto naturally order themselves.
 * In a sorted list, the Person with the highest severity level would be the firstelement. 
 * Similarly, the Person with the highest severity level would be the first one treated at the Hospital.
 * Patients are treated in sorted order by their natural ordering. If a natural ordering is not defined, patientsare treated in FIFO order.
 * @author Tristan Alvey
 *
 * @param <PatientType>
 */
public class PriorityQueueHospital<PatientType> extends Hospital<PatientType>{

	PriorityQueue<PatientType> pq;
	public PriorityQueueHospital() {
		pq = new PriorityQueue<PatientType>();
	}
	@Override
	public void addPatient(PatientType patient) {
		pq.add(patient);
		
	}

	@Override
	public PatientType nextPatient() {
		return pq.element();
	}

	@Override
	public PatientType treatNextPatient() {
		return pq.remove();
	}

	@Override
	public int numPatients() {
		return pq.size();
	}

	@Override
	public String hospitalType() {
		
		return pq.getClass().getName();
	}

	@Override
	public String allPatientInfo() {
		return pq.toString();
	}
	

}
