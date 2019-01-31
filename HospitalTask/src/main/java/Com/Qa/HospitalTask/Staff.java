package Com.Qa.HospitalTask;

public class Staff extends People {
	String employmentType;
	String title;
	String securityPermissions;

	
	public Staff(String foreName, String surName, int age, String homeAddress, String employmentType, String title,
			String securityPermissions) {
		super(foreName, surName, age, homeAddress);
		this.employmentType = employmentType;
		this.title = title;
		this.securityPermissions = securityPermissions;
	}
	
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSecurityPermissions() {
		return securityPermissions;
	}
	public void setSecurityPermissions(String securityPermissions) {
		this.securityPermissions = securityPermissions;
	}
	
	

}
