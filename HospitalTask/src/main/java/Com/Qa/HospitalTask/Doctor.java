package Com.Qa.HospitalTask;

public class Doctor extends Staff {
	

	int grade;
	String speciality;
	int numberOfPatients;

	public Doctor(String foreName, String surName, int age, String homeAddress, String employmentType, String title,
			String securityPermissions, String loginPassword) {
		super(foreName, surName, age, homeAddress, employmentType, title, securityPermissions, loginPassword);
		// TODO Auto-generated constructor stub
	}

	public void updateDiagnosis() {
		
	}
	
	public void updateTreatments() {
		
	}
	
	public void releasePatient() {
		
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	public void setNumberOfPatients(int numberOfPatients) {
		this.numberOfPatients = numberOfPatients;
	}
	
	
}
