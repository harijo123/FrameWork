package org.mts;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNG{
	
@BeforeSuite
public void beforesSUit() {
	System.out.println("A before suite");
}

@AfterSuite
public void afterSuite() {
	System.out.println("A after suite");
}

@BeforeClass
public void beforeClass() {
	System.out.println("A before class");
}

@AfterClass
public void AfetClass() {
	System.out.println("A After class");
}
 
@BeforeTest
public void beforetest() {
	System.out.println("A before test");
}

@AfterTest
public void AfetTest() {
	System.out.println("A After Test");
}

@BeforeMethod
public void beforeMethod() {
	System.out.println("A before Method");
}

@AfterMethod
public void Afeterethod() {
	System.out.println("A After Method");
}

@Test
public void login(){
System.out.println(" login");
}

@Test 
public void signup(){
System.out.println(" signup");
}

@Test 
public void click(){
System.out.println(" click");
}
}