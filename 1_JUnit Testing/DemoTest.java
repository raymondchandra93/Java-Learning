/**
 * The class containing your tests for the {@link Demo} class.  Make sure you
 * test all methods in this class (including both 
 * {@link Demo#main(String[])} and 
 * {@link Demo#isTriangle(double, double, double)}).
 */
package edu.umn.foo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class DemoTest {
	
	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	
	@Test
	public void test_is_triangle_2() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}
	
	@Test
	public void test_is_triangle_3() {
		assertTrue(Demo.isTriangle(5, 13, 12));
	}
	
	@Test
	public void test_is_triangle_4() {
		assertTrue(Demo.isTriangle(12, 5, 13));
	}
	
	@Test
	public void test_is_triangle_5() {
		assertTrue(Demo.isTriangle(12, 13, 5));
	}
	
	@Test
	public void test_is_NOT_triangle_1() {
		assertFalse(Demo.isTriangle(8, 5, 13));
	}
	
	@Test
	public void test_is_NOT_triangle_2() {
		assertFalse(Demo.isTriangle(5, 13, 7));
	}
	
	@Test
	public void test_is_NOT_triangle_3() {
		assertFalse(Demo.isTriangle(13, 5, 7));
	}
	
	@Test
	public void test_is_NOT_triangle_4() {
		assertFalse(Demo.isTriangle(13, 7, 5));
	}
	
	@Test
	public void test_is_NOT_triangle_5() {
		assertFalse(Demo.isTriangle(13, 7, 5));
	}
	
	
	@Test
	public void test_main_program_1( ) {
		ByteArrayInputStream in =
				new ByteArrayInputStream("5\n12\n13\n".getBytes());		
		System.setIn(in);
		
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		// Invoke
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
		consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
		consoleOutput += "This is a triangle." + System.getProperty("line.separator");
		
		assertEquals(consoleOutput, out.toString());
	}
}
