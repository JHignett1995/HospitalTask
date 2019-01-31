package Com.Qa.HospitalTask;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest  {

	@Test
	public void addYoTeam() {

		Hospital MyHospital = new Hospital(12, 12);
		Receptionist Me = new Receptionist("foreName", "surName", 12, "homeAddress", "employmentType", "title",
				"securityPermissions");
		MyHospital.listOfAllPatients.add(new Patient("Jordan", "Hignett", 23, "Anchorage 1", "Broken Leg", "Ward 1",
				"Ice", "Not Broken", "Dr Jeremiah"));
		
		
		assertEquals(MyHospital.listOfAllPatients.get(0),Me.patientFinder(MyHospital, "Jordan", "Hignett", "Anchorage 1"));

	}

}
