package Com.Qa.HospitalTask;

public class Nurse extends Staff {
	
	int assignedWard;
	
	public Nurse(String foreName, String surName, int age, String homeAddress, String employmentType, String title,
			String securityPermissions, String loginPassword) {
		super(foreName, surName, age, homeAddress, employmentType, title, securityPermissions, loginPassword);
		// TODO Auto-generated constructor stub
	}

	public int getAssignedWard() {
		return assignedWard;
	}
	public void setAssignedWard(int assignedWard) {
		this.assignedWard = assignedWard;
	}
	public void administerTreatment(){}
	public void findOutTreatment() {}
	
	
}
