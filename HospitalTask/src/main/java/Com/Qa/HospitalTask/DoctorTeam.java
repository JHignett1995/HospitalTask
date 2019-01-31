package Com.Qa.HospitalTask;

import java.util.ArrayList;
import java.util.List;

public class DoctorTeam {

	private int assignedWard;
	private int numberOfTeamMembers;
	List<Doctor> doctorTeam = new ArrayList<Doctor>();
	
	public DoctorTeam(int assignedWard, int numberOfTeamMembers, List<Doctor> doctorTeam) {
		super();
		this.assignedWard = assignedWard;
		this.numberOfTeamMembers = numberOfTeamMembers;
		this.doctorTeam = doctorTeam;
	}
	
	public int getAssignedWard() {
		return assignedWard;
	}
	public void setAssignedWard(int assignedWard) {
		this.assignedWard = assignedWard;
	}
	public int getNumberOfTeamMembers() {
		return numberOfTeamMembers;
	}
	public void setNumberOfTeamMembers(int numberOfTeamMembers) {
		this.numberOfTeamMembers = numberOfTeamMembers;
	}
	public List<Doctor> getDoctorTeam() {
		return doctorTeam;
	}
	public void setDoctorTeam(List<Doctor> doctorTeam) {
		this.doctorTeam = doctorTeam;
	}
	
	
	
}
