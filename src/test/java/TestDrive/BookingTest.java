package TestDrive;

import org.testng.annotations.Test;

import BaseDrive.BaseClass;
import PageDrive.BookingPage;

public class BookingTest extends BaseClass {

	@Test
	public void Booking() {

		BookingPage Book = new BookingPage(driver);
		Book.Home("KADAYANALLUR - KDNL", "CHENNAI EGMORE - MS (CHENNAI)");
		Book.Travel();
	}
}
