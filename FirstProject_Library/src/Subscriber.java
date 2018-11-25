
public class Subscriber {

	private String nameOfTheSubscriber;
	private String address;
	
	
	public String getNameOfTheSubscriber() {
		return nameOfTheSubscriber;
	}
	
	public void setNameOfTheSubscriber(String nameOfTheSubscriber) {
		this.nameOfTheSubscriber = nameOfTheSubscriber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Subscriber Name = " + nameOfTheSubscriber + " address = " + address;
	}
	
	
	
	
}
