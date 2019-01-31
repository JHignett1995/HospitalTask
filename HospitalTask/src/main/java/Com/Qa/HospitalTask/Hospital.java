package Com.Qa.HospitalTask;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	private int numberOfWards = 12;
	private int maxPatientsPerWard =12;
	public List<Patient> patientsOnWard0 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard1 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard2 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard3 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard4 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard5 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard6 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard7 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard8 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard9 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard10 = new ArrayList<Patient>();
	public List<Patient> patientsOnWard11 = new ArrayList<Patient>();
	
	
	
	public List<Staff> listOfAllStaff = new ArrayList<Staff>();
	public List<Patient> listOfAllPatients = new ArrayList<Patient>();
	
	public Hospital(int numberOfWards, int maxPatientsPerWard) {
		super();
		this.numberOfWards = numberOfWards;
		this.maxPatientsPerWard = maxPatientsPerWard;

	}
	
}
