package Com.Qa.HospitalTask;

public class Receptionist extends Staff {
	
	public Receptionist(String foreName, String surName, int age, String homeAddress, String employmentType,
			String title, String securityPermissions, String loginPassword) {
		super(foreName, surName, age, homeAddress, employmentType, title, securityPermissions, loginPassword);
		// TODO Auto-generated constructor stub
	}
	public void admitPatient() {}
	public void releasePatient() {}
	public void requestPatientInformation() {}
	public void queryWardCapacity() {}
}
