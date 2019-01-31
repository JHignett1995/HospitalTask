package Com.Qa.HospitalTask;

public abstract class People {
	private String foreName;
	private String surName;
	private int age;
	private String homeAddress;
	
	public People(String foreName, String surName, int age, String homeAddress) {
		super();
		this.foreName = foreName;
		this.surName = surName;
		this.age = age;
		homeAddress = homeAddress;
	}
	
	public String getForeName() {
		return foreName;
	}
	public void setForeName(String foreName) {
		this.foreName = foreName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return homeAddress;
	}
	public void setAddress(String address) {
		homeAddress = address;
	}
	
}
