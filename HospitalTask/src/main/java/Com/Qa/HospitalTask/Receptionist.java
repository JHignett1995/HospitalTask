package Com.Qa.HospitalTask;

import java.util.Scanner;

public class Receptionist extends Staff {

	public Receptionist(String foreName, String surName, int age, String homeAddress, String employmentType,
			String title, String securityPermissions) {
		super(foreName, surName, age, homeAddress, employmentType, title, securityPermissions);
		// TODO Auto-generated constructor stub
	}

	public void admitPatient(Hospital MyHospital) {
		System.out.println("Enter patients first name: ");
		Scanner foreName = new Scanner(System.in);
		String firstName = foreName.nextLine();

		System.out.println("Enter patients last name: ");
		Scanner surName = new Scanner(System.in);
		String lastName = surName.nextLine();

		System.out.println("Enter patients age: ");
		Scanner age = new Scanner(System.in);
		int ageOfPatient = age.nextInt();

		System.out.println("Enter patients home address: ");
		Scanner address = new Scanner(System.in);
		String home = address.nextLine();

		System.out.println("Enter patients ailment: ");
		Scanner ailment = new Scanner(System.in);
		String sick = ailment.nextLine();

		System.out.println("Enter patients location in hospital: ");
		Scanner location = new Scanner(System.in);
		String hospitalLocation = location.nextLine();

		System.out.println("Enter patients treatment: ");
		Scanner treatment = new Scanner(System.in);
		String treat = treatment.nextLine();

		System.out.println("Enter patients diagnosis: ");
		Scanner diagnosis = new Scanner(System.in);
		String diag = diagnosis.nextLine();

		System.out.println("Enter patients assigned doctor: ");
		Scanner assignedDoctor = new Scanner(System.in);
		String doctor = assignedDoctor.nextLine();

		MyHospital.listOfAllPatients
				.add(new Patient(firstName, lastName, ageOfPatient, home, sick, hospitalLocation, treat, diag, doctor));

	}

	public Patient patientFinder(Hospital MyHospital, String PatientName, String PatientSurname, String Address) {
		Patient Temp = null;
		for (int i = 0; i < 12; i++) {
			if (MyHospital.listOfAllPatients.get(i).getForeName().equals(PatientName)) {
				if (MyHospital.listOfAllPatients.get(i).getSurName().equals(PatientSurname)) {
					if (MyHospital.listOfAllPatients.get(i).getAddress().equals(Address)) {
						Temp = MyHospital.listOfAllPatients.get(i);

					}
				}
			}
		}
		System.out.println("Test");
		return Temp;
	}

	public void releasePatient(Hospital MyHospital, String forename, String surname, String address) {
		Patient Temp = patientFinder(MyHospital, forename, surname, address);
		MyHospital.listOfAllPatients.remove(Temp);
		for (int i = 0; i < 12; i++) {
			if (MyHospital.patientsOnWard0.get(i) == Temp) {
				MyHospital.patientsOnWard0.remove(Temp);
			} else if (MyHospital.patientsOnWard1.get(i) == Temp) {
				MyHospital.patientsOnWard1.remove(Temp);
			} else if (MyHospital.patientsOnWard2.get(i) == Temp) {
				MyHospital.patientsOnWard2.remove(Temp);
			} else if (MyHospital.patientsOnWard3.get(i) == Temp) {
				MyHospital.patientsOnWard3.remove(Temp);
			} else if (MyHospital.patientsOnWard4.get(i) == Temp) {
				MyHospital.patientsOnWard4.remove(Temp);
			} else if (MyHospital.patientsOnWard5.get(i) == Temp) {
				MyHospital.patientsOnWard5.remove(Temp);
			} else if (MyHospital.patientsOnWard6.get(i) == Temp) {
				MyHospital.patientsOnWard6.remove(Temp);
			} else if (MyHospital.patientsOnWard7.get(i) == Temp) {
				MyHospital.patientsOnWard7.remove(Temp);
			} else if (MyHospital.patientsOnWard8.get(i) == Temp) {
				MyHospital.patientsOnWard8.remove(Temp);
			} else if (MyHospital.patientsOnWard9.get(i) == Temp) {
				MyHospital.patientsOnWard9.remove(Temp);
			} else if (MyHospital.patientsOnWard10.get(i) == Temp) {
				MyHospital.patientsOnWard10.remove(Temp);
			} else if (MyHospital.patientsOnWard11.get(i) == Temp) {
				MyHospital.patientsOnWard11.remove(Temp);
			} else {
				System.out.println("Paient has left the building");
			}
		}
	}

	public String requestPatientInformation(Hospital MyHospital, String forename, String surname, String address) {

		String patientDetails = "";
		patientDetails = patientDetails + patientFinder(MyHospital, forename, surname, address).getForeName() + " ";
		patientDetails = patientDetails + patientFinder(MyHospital, forename, surname, address).getSurName() + "\n";
		patientDetails = patientDetails + patientFinder(MyHospital, forename, surname, address).getAge() + "\n";
		patientDetails = patientDetails + patientFinder(MyHospital, forename, surname, address).getAddress() + "\n";
		patientDetails = patientDetails + "Doctor is "
				+ patientFinder(MyHospital, forename, surname, address).getAssignedDoctor() + "\n";
		patientDetails = patientDetails + "is on ward "
				+ patientFinder(MyHospital, forename, surname, address).getLocation() + "\n";
		return patientDetails;
	}

	public boolean queryWardCapacity(Hospital enterhospital) {
		return false;

	}
}
