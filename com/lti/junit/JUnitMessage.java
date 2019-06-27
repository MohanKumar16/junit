package com.lti.junit;

public class JUnitMessage {
String m;
JUnitMessage(String msg)
{
	m=msg;
}
String printMessage()
{
	return m;
}
String PrintHiMessage() {
	return "hi!"+m;
}
}