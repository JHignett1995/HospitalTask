package Com.Qa.HospitalTask;

public class Staff extends People {
	String employmentType;
	String title;
	String securityPermissions;
	String loginID;
	String loginPassword;
	int count=0;

	
	public Staff(String foreName, String surName, int age, String homeAddress, String employmentType, String title,
			String securityPermissions) {
		super(foreName, surName, age, homeAddress);
		this.employmentType = employmentType;
		this.title = title;
		this.securityPermissions = securityPermissions;
		
	}
	
	
	
	public String getLoginID() {
		return loginID;
	}



	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}



	public String getLoginPassword() {
		return loginPassword;
	}



	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
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
