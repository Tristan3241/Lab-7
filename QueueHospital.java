import java.util.LinkedList;
import java.util.Queue;

public class QueueHospital<PatientType> extends Hospital<PatientType>{
	Queue<PatientType> q;
	
	public QueueHospital(){
		q = new LinkedList<PatientType>();
	}
	@Override
	public void addPatient(PatientType patient) {
		q.add(patient);
		
	}

	@Override
	public PatientType nextPatient() {
		return q.peek();
	}

	@Override
	public PatientType treatNextPatient() {
		return q.remove();
	}

	@Override
	public int numPatients() {
		return q.size();
	}

	@Override
	public String hospitalType() {
		return this.getClass().getName();
	}

	@Override
	public String allPatientInfo() {
		return q.toString();
	}

	
	
}
