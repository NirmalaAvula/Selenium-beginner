package TestNG;

import org.testng.annotations.Test;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Allannotations {
	private static final Logger logger = LogManager.getLogger(Allannotations.class);

  @Test
  public void abc() {
	  logger.info("abc executed");
  }
  @Test
  public void abcd() {
	  logger.info("abcd executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  logger.info("Before method executed");

  }

  @AfterMethod
  public void afterMethod() {
	  logger.info("After method executed");

  }

  @BeforeClass
  public void beforeClass() {
	  logger.info("Before class executed");

  }

  @AfterClass
  public void afterClass() {
	  logger.info("After class executed");

  }

  @BeforeTest
  public void beforeTest() {
	  logger.info("Before test executed");

  }

  @BeforeSuite
  public void beforeSuite() {
	  logger.info("Before suite executed");

  }

  @AfterSuite
  public void afterSuite() {
	  logger.info("After suite executed");

  }

}
