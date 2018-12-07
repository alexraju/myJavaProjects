import java.util.ArrayList;
import java.util.List;

public class Hospital {

	int hospitalNumber;
	String hospitalName;
	String hospitalAddress;
	
	private List<Patient> allPatients = new ArrayList<>();
	private List<Doctor> allDoctors = new ArrayList<>();

	public Hospital(int hospitalNumber, String hospitalName, String hospitalAddress) {
		super();
		this.hospitalNumber = hospitalNumber;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
	}
	
	public int getHospitalNumber() {
		return hospitalNumber;
	}

	public void setHospitalNumber(int hospitalNumber) {
		this.hospitalNumber = hospitalNumber;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public String toString() {
		return "Hospital [hospitalNumber=" + hospitalNumber + ", hospitalName=" + hospitalName + ", hospitalAddress="
				+ hospitalAddress + "]";
	}
	// Register a patient
	public void addPatient(Patient patient) {
		allPatients.add(patient);
	}
	public void removePateint(Patient patient) {
		allPatients.remove(patient);
	}
	public void addDoctor(Doctor doctor) {
		allDoctors.add(doctor);
	}
	public void removeDoctor(Doctor doctor) {
		allDoctors.remove(doctor);
	}
	// to print the name of doctor
	public void showDoctors() {
		for(int i = 0; i < allDoctors.size(); i++) {
			Doctor d = allDoctors.get(i);
			System.out.println(d);
		}
	}
	
	// to print the name of patient
	public void showPatient() {
		for(int i = 0; i < allPatients.size(); i++){
		Patient p = allPatients.get(i);
		System.out.println(p);
		}
	}
	
	// Assigning doctors to Patients
	public void assignDoctor() {
		System.out.println("Patient Illness");
		String input1 = reader.nextString();
		if(input1 = Patient.illness);
			
	}
	// Checkout/ no checkout after surgery
	public void checkout() {
		
	}
	

}
