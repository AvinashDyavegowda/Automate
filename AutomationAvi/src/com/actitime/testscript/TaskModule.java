package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule extends BaseClass{

	@Test
	public void createTask() {
	Reporter.log("createTask", true);}
	@Test
	public void deleteTask() {
	Reporter.log("deleteTask", true);}
	@Test
	public void modifyTask() {
	Reporter.log("modifyTask", true);}
	
}
