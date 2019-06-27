package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuiteTest1 {

public String message="Raj";
JUnitMessage junitMessage=new JUnitMessage(message);
public void testJUnitMessage()
{
	System.out.println("Junit Message is printing");
	junitMessage.printMessage();
	}

@Test
public void testJUnitHiMessage()
{
	message="hi!" +message;
	System.out.println("Junit Hi Message is printing");
	assertEquals(message,junitMessage.PrintHiMessage());
	System.out.println("Suite Test 1 is successful"+message);
}
}
