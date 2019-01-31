package Com.Qa.HospitalTask;

public class Patient extends People {
	String ailmentOnEntry;
	String locationInHospital;
	String diagnosis;
	
	public Patient(String foreName, String surName, int age, String address, String ailmentOnEntry, String locationInHospital,
			String diagnosis) {
		super(foreName, surName, age, address);
		this.ailmentOnEntry = ailmentOnEntry;
		this.locationInHospital = locationInHospital;
		this.diagnosis = diagnosis;
	}


	public String getAilment() {
		return ailmentOnEntry;
	}


	public void setAilment(String ailment) {
		this.ailmentOnEntry = ailment;
	}


	public String getLocation() {
		return locationInHospital;
	}


	public void setLocation(String location) {
		this.locationInHospital = location;
	}


	public String getDiagnosis() {
		return diagnosis;
	}


	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

}
