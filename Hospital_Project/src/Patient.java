
public class Patient {

	int patientNumber;
	String patientName;
	String patientAddress;
	String illness;

	public int getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(int patientNumber) {
		this.patientNumber = patientNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	
	public String getIllness() {
		return illness;
	}
	
	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String toString() {
		return "Patient Info - " + patientNumber + " , " + patientName + " ' " + patientAddress + " , " + illness;
	}

}
