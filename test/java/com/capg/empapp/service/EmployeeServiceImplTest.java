package com.capg.empapp.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capg.empapp.dto.Employee;
import com.capg.empapp.execptions.WrongSalaryException;

class EmployeeServiceImplTest {
	
	static EmployeeServiceImpl service;
	
	@BeforeAll
	static void doStartingThings()
	{
		service = new EmployeeServiceImpl();
	}
	
	

	@Test
	void testAddEmployee() {
		
		try
		{
			boolean actual = service.addEmployee(new Employee(88,"test",10, 15000));
			
			assertEquals(true, actual);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}//end test()
	
	@Test
	void testAddEmployeeThrows()throws WrongSalaryException
	{
					
			assertThrows(WrongSalaryException.class,
					()-> service.addEmployee(new Employee(88,"test",10, 105000)));	
		
	}
	
	@Test
	void testGetAllEmployees()
	{
		
		Employee actual[] = service.getAllEmployees();
		
		/* create test data*/
		Employee expected[]  = new Employee[100];
		int count = 0;
		expected[count++] = 	new Employee(101, "ramesh", 8, 7000);
		expected[count++] = 	new Employee(101, "suresh", 2, 7000);
		expected[count++] = 	new Employee(101, "rakesh", 1, 7000);
		expected[count++] = 	new Employee(101, "lokesh", 5, 7000);
		expected[count++] = 	new Employee(88,"test",10, 15000);
		
		
		assertArrayEquals(expected, actual);
	}
	
	
	/*
	 
	  assertIteratableEquals(expectedCollection,actualCollection);
	  
	 */

}//end class
