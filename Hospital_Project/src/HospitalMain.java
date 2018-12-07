
public class HospitalMain {

	public static void main(String[] args) {
		Hospital hospital1 = new Hospital( 333, "Yashoda", "Malakpet");
		Doctor doctor1 = new Doctor( 4444, "Bharadwaj", "Saroornagar", "Pediatrician");
		
		Patient p1 = new Patient();
		p1.setPatientNumber(55555);
		p1.setPatientName("Someome");
		p1.setIllness("cardiac");

		hospital1.addPatient(p1);
		hospital1.showPatient();
		
		
	}

}
