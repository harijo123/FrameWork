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

public class TestNGSuite{
	
//@BeforeSuite
//public void beforesSUit() {
//	System.out.println("B before suite");
//}
//
//@AfterSuite
//public void afterSuite() {
//	System.out.println("B after suite");
//}
//
//@BeforeClass
//public void beforeClass() {
//	System.out.println("B before class");
//}
//
//@AfterClass
//public void AfetClass() {
//	System.out.println("B After class");
//}
// 
//@BeforeTest
//public void beforetest() {
//	System.out.println("B before test");
//}
//
//@AfterTest
//public void AfetTest() {
//	System.out.println("B After Test");
//}
//
//@BeforeMethod
//public void beforeMethod() {
//	System.out.println("B before Method");
//}
//
//@AfterMethod
//public void Afeterethod() {
//	System.out.println("B After Method");
//}

@Test
public void tc1(){
System.out.println(" tc_06");
}

@Test
public void tc_005(){
System.out.println(" tc_05");
}

@Test 
public void tc_04(){
System.out.println(" tc_04");
}
}