package TestNG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class priority {
	private static final Logger logger = LogManager.getLogger(Allannotations.class);

	@Test(priority=1)
	public void signup() {
		logger.info("signup executed");
	}
	@Test(priority=2)
	public void login() {
		logger.info("login executed");
}
	@Test(priority=3)
	public void searchforthebus() 
	{
		logger.info("searched for the bus");
}
	@Test(priority=4)
	public void bookticketforbus() {
		logger.info("Bus ticket was booked");
	}
	@Test(priority=5)
	public void saveticket() {
		logger.info("Ticket was saved");
	}
	@Test(priority=6)
	public void close() {
		logger.info("Closed");
	}
	
}
