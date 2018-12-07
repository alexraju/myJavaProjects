
public class Doctor {

	int doctorNumber;
	String doctorName;
	String doctorAddress;
	String specialization;


	public Doctor(int doctorNumber, String doctorName, String doctorAddress, String specialization) {
		this.doctorNumber = doctorNumber;
		this.doctorName = doctorName;
		this.doctorAddress = doctorAddress;
		this.specialization = specialization;
	}

	public int getDoctorNumber() {
		return doctorNumber;
	}

	public void setDoctorNumber(int doctorNumber) {
		this.doctorNumber = doctorNumber;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	
	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String toString() {
		return "Doctor Info -  " + doctorNumber + " , " + doctorName + "  , " + doctorAddress + " , " + specialization;
	}
}
