package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.RegistrationPage;

public class RegistrationTest extends BaseClass {

	@Test
	public void Registration() {

		RegistrationPage Reg = new RegistrationPage(driver);
		Reg.Basic("Vairam11", "Welcome@99", "Rocky");
		Reg.Personal("Vairam", "03-04-1999", "msvairam199@gmail.com", "9999776611");
		Reg.Address("40 B2", "1st Street", "600044", "9988776655");
	}
}
