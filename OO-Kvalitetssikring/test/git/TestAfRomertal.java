package git;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAfRomertal {

	@Test
	public void testAfOverFireIer() {
		Romertal romertal = new Romertal("I", "IIII");
		
		assertEquals("V", romertal.getFacit());
	}
	
	@Test
	public void testAfOverFireXer() {
		Romertal romertal = new Romertal("X", "XXXX");
		
		assertEquals("L", romertal.getFacit());
	}
	
	@Test
	public void testAfOverFireCer() {
		Romertal romertal = new Romertal("C", "CCCC");
		
		assertEquals("D", romertal.getFacit());
	}
	
	@Test
	public void testAfOverEnVer() {
		Romertal romertal = new Romertal("V", "V");
		
		assertEquals("X", romertal.getFacit());
	}
	
	@Test
	public void testAfOverEnLer() {
		Romertal romertal = new Romertal("L", "L");
		
		assertEquals("C", romertal.getFacit());
	}
	
	@Test
	public void testAfOverEnDer() {
		Romertal romertal = new Romertal("D", "D");
		
		assertEquals("M", romertal.getFacit());
	}
}
