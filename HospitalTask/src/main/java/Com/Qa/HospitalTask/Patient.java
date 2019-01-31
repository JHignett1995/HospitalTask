package Com.Qa.HospitalTask;

public class Patient extends People {
	private int uniqueID;
	private String ailmentOnEntry;
	private String locationInHospital;
	private String treatments;
	private String diagnosis;
	private String assignedDoctor;
	private int count = 0;

	public Patient(String foreName, String surName, int age, String homeAddress, String ailmentOnEntry,
			String locationInHospital, String treatments, String diagnosis, String assignedDoctor) {
		super(foreName, surName, age, homeAddress);
		this.ailmentOnEntry = ailmentOnEntry;
		this.locationInHospital = locationInHospital;
		this.treatments = treatments;
		this.diagnosis = diagnosis;
		this.setAssignedDoctor(assignedDoctor);
		if (count < 100000) {
			count++;
		} else {
			count = 1;
		}
		this.uniqueID = count;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID() {
		this.uniqueID = count;
	}

	public String getTreatments() {
		return treatments;
	}

	public void setTreatments(String treatments) {
		this.treatments = treatments;
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

	public String getAssignedDoctor() {
		return assignedDoctor;
	}

	public void setAssignedDoctor(String assignedDoctor) {
		this.assignedDoctor = assignedDoctor;
	}
}
